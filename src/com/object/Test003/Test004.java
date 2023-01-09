package com.object.Test003;

public class Test004 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.shout();
        Dog dog = new Dog();
        dog.shout();
        animal.shout();
    }

}

class Animal {
    int a = 10;
    void shout() {
        System.out.println("发出声音");
        System.out.println(a);
    }
}

class Dog extends Animal {

    void shout() {
        a=11;
        System.out.println(a);
        System.out.println("汪汪汪");
    }
}
