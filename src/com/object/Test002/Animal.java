package com.object.Test002;

import javax.naming.Name;

public class Animal {

    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + ":正在吃");
    }
    public static void main(String[] args) {
        Bird bird = new Bird("麻雀");
        bird.fly();
    }
}

class Bird extends Animal {

    public String name = "小花";

    public Bird(String name) {
        super(name);
        this.name = "小明";

    }
    public void fly() {
        System.out.println("父类定义的名称:" + super.name);
        System.out.println(this.name + "：正在飞");
        super.eat();
    }
}

