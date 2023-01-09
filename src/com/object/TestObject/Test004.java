package com.object.TestObject;

public class Test004 {

    public static void main(String[] args) throws CloneNotSupportedException {
        CarDeep carDeep1 = new CarDeep(11,new EngineDeep(111,"V8"),new TireDeep(1111,"米其林"));

        CarDeep carDeep2 = (CarDeep) carDeep1.clone();
        System.out.println(carDeep1);
        System.out.println(carDeep2);
    }
}

class CarDeep implements Cloneable{

    public int cid;
    public EngineDeep engine;
    public TireDeep tire;

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", engine=" + engine +
                ", tire=" + tire +
                '}';
    }

    public CarDeep(int cid, EngineDeep engine, TireDeep tire) {
        this.cid = cid;
        this.engine = engine;
        this.tire = tire;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // cd 是被克隆的对象
        CarDeep cd = (CarDeep) super.clone();
        // 引擎的深度克隆
        cd.engine = (EngineDeep) this.engine.clone();
        // 轮胎的深度克隆
        cd.tire = (TireDeep) this.tire.clone();
        return cd;
    }
}

class EngineDeep implements Cloneable{

    public int eid;
    public String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public EngineDeep(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }
}


class TireDeep implements Cloneable{
    public int tid;
    public String name;

    @Override
    public Object clone() throws CloneNotSupportedException {


        return super.clone();
    }

    public TireDeep(int tid, String name) {
        this.tid = tid;
        this.name = name;
    }
}


