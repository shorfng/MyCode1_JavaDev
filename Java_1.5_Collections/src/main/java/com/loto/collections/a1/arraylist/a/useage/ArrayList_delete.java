package com.loto.collections.a1.arraylist.a.useage;

import java.util.ArrayList;

/**
 * Author：蓝田_Loto
 * <p>Date：2022-02-22 23:51</p>
 * <p>PageName：ArrayList_delete.java</p>
 * <p>Function：ArrayList 一边遍历一边删除 </p>
 */

public class ArrayList_delete {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        // 删除 下标 > 2
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 2) {
                arrayList.remove(i);
                i--;
            }
        }

        // 遍历
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
