package com.object.Test003;

public abstract class Test006 {

    int a =10;

    abstract void test001();

    void test002(){
        System.out.println("Test006.test002");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();

        Test006 test2 = new Test1();

        System.out.println(test1.a);
        System.out.println(test2.a);
        test1.test001();
        test2.test001();
    }
}

class Test1 extends Test006{

    @Override
    void test001() {
        System.out.println("Test1.test001");
    }


}
