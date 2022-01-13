package com.loto.oriented.f.inheritance.a.extendsKeyword;

/**
 * Author：蓝田_Loto
 * <p>PageName：Student.java
 * </p>
 * <p>Function：子类
 */

public class Student extends Person {
	String id; // 学号

	public void study() {
		System.out.println("调用了子类特有的学习方法!");
	}
}
