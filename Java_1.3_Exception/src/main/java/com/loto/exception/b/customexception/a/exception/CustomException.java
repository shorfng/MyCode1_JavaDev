package com.loto.exception.b.customexception.a.exception;

/**
 * Author：蓝田_Loto
 * <p>PageName：CustomException.java</p>
 * <p>Function：自定义异常继承Exception
 */

public class CustomException extends Exception {
    // 必须提供一个空参构造器
    public CustomException() {
		super();
	}

    // 构造方法中，super将异常信息传递给父类
    public CustomException(String message) {
		super(message);
	}
}
