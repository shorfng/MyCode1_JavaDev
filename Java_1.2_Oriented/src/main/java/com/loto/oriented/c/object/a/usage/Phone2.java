package com.loto.oriented.c.object.a.usage;

/**
 * Author：蓝田_Loto
 * <p>PageName：Phone2.java</p>
 * <p>Function：定义手机类
 */

public class Phone2 {
    // 成员变量
    String brand; // 品牌
    double price; // 价格
    double size;  // 尺寸

    // 成员方法
    void call(String name) {
        System.out.println("调用成员方法：打电话给" + name);
    }

    void sendMeg(String name) {
        System.out.println("调用成员方法：发短信给" + name);
    }
}
