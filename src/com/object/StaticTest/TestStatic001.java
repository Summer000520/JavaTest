package com.object.StaticTest;

public class TestStatic001 {

    static {
        System.out.println("此处，可执行类的初始化工作！");
    }

    public static void main(String[] args) {
        System.out.println("main方法中的第一句");
    }
}
