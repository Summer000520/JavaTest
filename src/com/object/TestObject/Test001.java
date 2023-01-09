package com.object.TestObject;

import java.util.Objects;

public class Test001 {

    public static void main(String[] args) throws CloneNotSupportedException {
       Student s1 = new Student(17,"Tom");
       Student s2 = (Student) s1.clone();
        System.out.println(s1==s2);     // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1);
        System.out.println(s2);
    }
}


class Student implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                '}';
    }

    int sno;
    String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    void method01(){
        System.out.println("Student.method01");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sno == student.sno &&
                Objects.equals(name, student.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }
}
