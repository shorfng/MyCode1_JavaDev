package com.loto.oriented.c.object.b.anonymous;

/**
 * Author：蓝田_Loto
 * <p>PageName：Main.java
 * </p>
 * <p>Function：匿名对象
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("======== 创建有名字的对象 ==========");
        // 创建有名字的学生对象
        Student s = new Student();
        s.study();
        System.out.println(s);

        // 匿名对象只能使用一次
        System.out.println("======== 创建匿名对象1，但是并未进行任何操作 ==========");
        new Student();

        System.out.println("======== 创建匿名对象2，并调用study()方法 ==========");
        new Student().study();

        System.out.println("======== 用法1：把匿名对象作为方法的实参传递 ==========");
        Student p1 = new Student();
        method1(p1);            // 把有名字的p1对象作为方法的实参传递
        method1(new Student()); // 把匿名对象作为方法的实参传递

        System.out.println("======== 用法2：匿名对象作为方法返回值 ==========");
        Student p2 = method2();
        p2.study();
    }

    private static void method1(Student p) {
        p.study();
    }

    private static Student method2() {
        return new Student();  // 匿名对象作为方法返回值
    }
}
