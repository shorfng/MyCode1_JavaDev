package com.loto.api.e.stringbuilder;

/**
 * PageName：c_Capacity.java<p>
 * Date：2023-03-16 21:36<p>
 * Function：
 *
 * @author 蓝田_Loto
 */

public class c_Capacity {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println("默认长度：" + stringBuilder1.length());
        System.out.println("默认容量：" + stringBuilder1.capacity());
        System.out.println("======================");

        StringBuilder stringBuilder2 = new StringBuilder("hello");
        System.out.println("长度：" + stringBuilder2.length());
        System.out.println("容量：" + stringBuilder2.capacity());
        System.out.println("======================");

        StringBuilder stringBuilder3 = new StringBuilder();
        for (int i = 1; i <= 17; i++) {
            stringBuilder3.append("#");
        }
        System.out.println("长度：" + stringBuilder3.length());
        System.out.println("容量：" + stringBuilder3.capacity());
    }
}
