package com.object.Test001;

public class Student {

    private Integer id;
    private String name;
    private int age;

    void method01(){
        System.out.println("学习！");
    }

    public Student(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student(10);

        System.out.println(student);
    }

}
