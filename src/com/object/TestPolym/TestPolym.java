package com.object.TestPolym;

public class TestPolym {

    public static void main(String[] args) {
        Animal animal = new Dog();  //向上可以自动转型
        System.out.println(animal.age); //属性调用时，仍然时就基类的属性。属性没有多态!
//        animal.shout(); // 多态的具体表现

        animalCry(new Dog());
        // 传的具体时哪一个类就调用哪一个类的方法，大大提高了程序的可扩展性
        // 如果没有多态，我们这里需要写很多重载方法。如果增加一种动物，就需要重载一种动物的喊叫方法，非常麻烦
        // 有了多态，只需要增加这个类继承Animal基类就可以了
        animalCry(new Cat());

        Dog dog = (Dog) animal;
        dog.gnawBone();


        System.out.println(dog instanceof Animal);
        System.out.println(animal instanceof Cat);
        System.out.println(animal instanceof Dog);
}

    static void animalCry(Animal a) {
        a.shout();
    }

    static void animalCry(Dog dog){

    }
}

class Animal {
    int age = 10;

    public void shout() {
        System.out.println("叫了一声！");
    }
}

class Dog extends Animal {
    int age = 28;

    public void shout() {
        System.out.println("旺旺旺！");
    }

    public void gnawBone() {
        System.out.println("我再啃骨头");
    }
}

class Cat extends Animal {
    int age = 18;

    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}

