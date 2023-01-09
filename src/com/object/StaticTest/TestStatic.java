package com.object.StaticTest;

public class TestStatic {

    int a;
    static int width;

    static void gg(){
        System.out.println("gg");
    }

    void tt(){
        System.out.println("tt");
    }

    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
//        TestStatic.width=2;
        System.out.println(testStatic.width);
        TestStatic.gg();
        testStatic.gg();
        gg();
    }
}
