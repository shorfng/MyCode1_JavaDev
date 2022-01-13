package com.loto.exception.a.usage;

// finally,无论程序是否有异常出现,程序必须执行
public class d_finally {
	public static void main(String[] args) {
		try {
			</p>
 * <p>Function(0);
		} catch (Exception ex) {
			System.out.println(ex);

		} finally {
			System.out.println("代码必须执行");
		}
	}

	public static void </p>
 * <p>Function(int a) throws Exception {
		if (a == 0)
			throw new Exception();
		System.out.println(a);
	}
}
