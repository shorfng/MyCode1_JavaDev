package com.loto.oriented.g.polymorphism.f.instanceofsymbol;

public class Main {
    public static void main(String[] args) {
        // 创建一个人对象
        Person p = new Person();

        // 创建一个狗对象
        Dog dog = new Dog();
        p.function(dog); // 狗看家

        // 创建一个猫对象
        Cat cat = new Cat();
        p.function(cat); // 猫捉老鼠

        // ===============================================
        // 得到 对象cat 的类型
        System.out.println(cat.getClass()); // class com.loto.oriented.g.polymorphism.f.instanceofsymbol.Cat

        // 得到 类Cat 的类型
        System.out.println(Cat.class);      // class com.loto.oriented.g.polymorphism.f.instanceofsymbol.Cat

        // 比较 对象cat的类型 和 类Cat的类型 是否一致
        // 返回的是一个 boolean 类型的值
        System.out.println(cat.getClass() == Cat.class);  // true
    }
}
