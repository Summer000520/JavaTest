package com.object.TestException;

public class Test01 {

    public static void main(String[] args){

        try {
            int a = 10/0;
            System.out.println("Test01.main");
        }catch (Exception e){
//            e.printStackTrace();
            e.getMessage();
        }finally {
            System.out.println("必须处理的代码！");
        }

    }
}
