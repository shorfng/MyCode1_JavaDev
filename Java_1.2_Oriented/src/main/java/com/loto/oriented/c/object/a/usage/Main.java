package com.loto.oriented.c.object.a.usage;

/**
 * Author：蓝田_Loto
 * <p>PageName：Main.java</p>
 * <p>Function：对象的创建、对象的使用（对象的成员变量赋值、访问对象的成员变量值、调用对象的成员方法）
 */

public class Main {
    public static void main(String[] args) {
        // 创建对象
        Phone1 p = new Phone1();

        // 创建对象（对象q和对象p开辟的内存空间不同，里面的成员变量和成员方法也不是同一个）
        Phone2 q = new Phone2();

        // 对象的成员变量赋值
        p.brand = "华为";
        p.price = 4000.0;
        p.size = 4.0;

        // 访问对象的成员变量值
        System.out.println("===== 访问对象的成员变量 =====");
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.size);

        // 调用对象的成员方法
        System.out.println("===== 调用对象的成员方法 =====");
        p.call("CJ");
        p.sendMeg("TD");

        // 使用 println 方法打印 hashCode 值
        System.out.println("输出的是(类的全限定名称@内存地址)：" + q);

        // 使用 toString 方法打印对象的属性值
        // 对象名.toString
        System.out.println("===== 重写 toString 方法，打印对象 p 的属性值 =====");
        System.out.println(p.toString());

        // 对象名
        System.out.println("======因为 p 对象所在的类，重写了 toString，因此 p.toString() 和 p 的效果相同======");
        System.out.println(p);

    }
}
