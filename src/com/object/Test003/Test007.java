package com.object.Test003;

public class Test007 {

    public static void main(String[] args) {
        Volant volant = new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HIGHT);
        GoodMan goodMan = new GoodMan();
        Honest honest = new GoodMan();
        goodMan.helpOther();
        honest.helpOther();
        Honest.test01();
    }
}



interface Volant{
    int FLY_HIGHT = 100;
    void fly();
}

interface Honest{
    static void test01() {
        System.out.println("Honest.test01");
    }

    void helpOther();
}

class Angel implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("Angel.fly");
    }

    @Override
    public void helpOther() {
        System.out.println("Angel.helpOther");
    }
}

class GoodMan implements Honest{

    @Override
    public void helpOther() {
        System.out.println("GoodMan.helpOther");
    }
}

class BirdMan implements Volant{

    @Override
    public void fly() {
        System.out.println("BirdMan.fly");
    }
}
