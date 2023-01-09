package com.object.Test003;

public class Test003 {
    public void Method01(String name,int id){
        System.out.println("Test003.Method01");

    }

    public void Method01(String name, int...id){
        System.out.println("Test003.Method01");
        System.out.println(id[1]);
    }
    public void Method01(String...name){
        System.out.println("Test003.Method01");
        System.out.println(name[1]);
    }

    public static void main(String[] args) {
        Test003 test003 = new Test003();
        test003.Method01("张三",1,2);
        test003.Method01("张三","李四");
    }
}
