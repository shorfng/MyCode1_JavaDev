package com.loto.delegate.a.dynamicproxy;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 17:30
 * <p>PageName：UserServiceImpl.java
 * </p>
 * <p>Function：目标对象/被代理对象
 */

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("updateUser");
    }
}
