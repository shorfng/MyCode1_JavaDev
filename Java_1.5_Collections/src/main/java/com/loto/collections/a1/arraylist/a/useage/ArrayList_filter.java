package com.loto.collections.a1.arraylist.a.useage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Author：蓝田_Loto
 * <p>Date：2022-02-22 23:51</p>
 * <p>PageName：ArrayList_filter.java</p>
 * <p>Function：ArrayList 过滤 </p>
 */

public class ArrayList_filter {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add("H");
        arrayList.add("I");
        arrayList.add("b");


        // 取出 内容为b的
        List<String> list = arrayList.stream().filter(s -> s.contains("b")).collect(Collectors.toList());

        // 遍历
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("=========================");

        // 取出 下标 > 2的元素
        // 方式1
        AtomicInteger i2 = new AtomicInteger();
        List<String> list2 = arrayList.stream().filter(s -> i2.getAndIncrement() > 2).collect(Collectors.toList());

        // 遍历
        for (String s : list2) {
            System.out.println(s);
        }

        System.out.println("=========================");


        // 方式2
        Integer[] i3 = {0};
        List<String> list3 = arrayList.stream().filter(s -> ++i3[0] > 2).collect(Collectors.toList());

        // 遍历
        for (String s : list3) {
            System.out.println(s);
        }
    }
}
