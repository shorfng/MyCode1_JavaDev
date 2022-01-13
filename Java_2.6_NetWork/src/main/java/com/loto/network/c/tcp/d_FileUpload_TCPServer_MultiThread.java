package com.loto.network.c.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author：蓝田_Loto
 * Date：2018-12-28 16:41
 * <p>PageName：d_FileUpload_TCPServer_MultiThread.java
 * </p>
 * <p>Function：文件上传_服务器端_多线程版
 */

// 实现服务器端可以同时接收多个客户端上传的文件
public class d_FileUpload_TCPServer_MultiThread {
    public static void main(String[] args) throws IOException {
        // 1、创建服务器，等待客户端连接
        ServerSocket serverSocket = new ServerSocket(8888);

        // 实现多个客户端连接服务器的操作
        while (true) {
            final Socket clientSocket = serverSocket.accept();
            // 启动线程，完成与当前客户端的数据交互过程
            new Thread() {
                public void run() {
                    try {
                        // 显示哪个客户端Socket连接上了服务器
                        InetAddress ipObject = clientSocket.getInetAddress();//得到IP地址对象
                        String ip = ipObject.getHostAddress(); //得到IP地址字符串
                        System.out.println("连接IP:" + ip);

                        // 7、获取Socket的输入流
                        InputStream in = clientSocket.getInputStream();

                        // 8、创建目的地的字节输出流
                        //BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("D:\\upload\\" + ip + "(" + System.currentTimeMillis() + ").jpg"));
                        BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("Java_2.6_NetWork/src/main/resources/TD.jpg"));

                        // 9、把Socket输入流中的数据，写入目的地的字节输出流中
                        byte[] buffer = new byte[1024];
                        int len = -1;
                        while ((len = in.read(buffer)) != -1) {
                            //写入目的地的字节输出流中
                            fileOut.write(buffer, 0, len);
                        }

                        //-----------------反馈信息---------------------
                        // 10、获取Socket的输出流, 作用：写反馈信息给客户端
                        OutputStream out = clientSocket.getOutputStream();

                        // 11、写反馈信息给客户端
                        out.write("图片上传成功".getBytes());

                        out.close();
                        fileOut.close();
                        in.close();
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
        //serverSocket.close();
    }
}
