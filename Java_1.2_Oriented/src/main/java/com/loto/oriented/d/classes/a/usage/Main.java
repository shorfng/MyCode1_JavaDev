package com.loto.oriented.d.classes.a.usage;

/**
 * Author：蓝田_Loto
 * <p>PageName：Main.java
 * </p>
 * <p>Function：类的使用
 */

public class Main {
	public static void main(String[] args) {
		// 1.1 类作为方法的参数(传递有名对象p1)
		Person p1 = new Person();
		</p>
 * <p>Function(p1);

		System.out.println("=====================");

		// 1.2 类作为方法的参数(传递匿名对象new Person())
		</p>
 * <p>Function(new Person());

		System.out.println("=====================");

		// 2.1 类作为方法的返回值(有名对象)
		Student stu = new Student();
		Person p = stu.show();
		p.eat();
		p.run();

		System.out.println("=====================");

		// 2.2 类作为方法的返回值(匿名对象)
		new Student().show().eat();
		new Student().show().run();
	}

	// 方法的参数类型是Person类型
	public static void </p>
 * <p>Function(Person p) {
		p.eat();
		p.run();
	}
}
