package com.loto.api.q.stream;

import java.util.Arrays;

/**
 * Author：蓝田_Loto
 * <p>Date：2022-02-17 22:04</p>
 * <p>PageName：StreamArrays.java</p>
 * <p>Function：Stream 数组遍历</p>
 */

public class StreamArrays {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3};

        // for 循环遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("===============================");

        // for in 遍历
        for (Integer integer : arr) {
            System.out.println(integer);
        }
        System.out.println("===============================");

        // stream 遍历 - forEach x ->
        Arrays.asList(arr).stream().forEach(x -> System.out.println(x));
        System.out.println("===============================");

        // stream 遍历 - stream().forEach
        Arrays.asList(arr).stream().forEach(System.out::println);
        System.out.println("===============================");

        // stream 遍历 - forEach
        Arrays.asList(arr).forEach(System.out::println);
    }
}
