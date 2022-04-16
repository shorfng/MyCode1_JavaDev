package com.loto.collections.b1.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 18:27
 * <p>PageName：b3_HashMap_Ergodic_Lambda.java
 * </p>
 * <p>Function：HashMap_遍历（lambda）
 */

public class b3_HashMap_Ergodic_Lambda {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "ab");
        map.put(2, "cd");
        map.put(3, "ef");

        map.forEach((key, value) -> {
            System.out.println("key:" + key + " value:" + value);
        });
    }
}
