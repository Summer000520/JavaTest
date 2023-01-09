package com.object.TestObject;

public class Test003 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car(11,new Engine(221,"v8"),new Tire(331,"米其林"));
        Car car2 = (Car)car1.clone();

        System.out.println(car1);
        System.out.println(car2);
    }

}

class Car implements Cloneable{

    public int cid;
    public Engine engine;
    public Tire tire;

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", engine=" + engine +
                ", tire=" + tire +
                '}';
    }

    public Car(int cid, Engine engine, Tire tire) {
        this.cid = cid;
        this.engine = engine;
        this.tire = tire;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Engine{

    public int eid;
    public String name;

    public Engine(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }
}


class Tire{
    public int tid;
    public String name;

    public Tire(int tid, String name) {
        this.tid = tid;
        this.name = name;
    }
}

