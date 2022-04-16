package com.loto;

/**
 * Author：蓝田_Loto
 * <p>Date：2022-03-02 22:53</p>
 * <p>PageName：aa.java</p>
 * <p>Function：</p>
 */

public class Aa {
    int a = 0;
    boolean flag = false;


    public static void main(String[] args) throws InterruptedException {
        Aa aa = new Aa();
        Thread thread = new Thread(() -> {
            aa.w();
        });

        thread.start();
        aa.r();

    }

    public void w() {
        a = 1;
        flag = true;
        int i=0;
        while (flag){
            i++;
        }
    }

    public void r() {
        a = 2;
        if (flag) {
           //System.out.println(a);
        }
        flag = false;
        flag=true;
    }
}
