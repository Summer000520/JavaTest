package com.object.Test003;

public class Test01 {

    public static void main(String[] args) {
        Outter.Inner inner = new Outter.Inner();
    }
}

class Outter{
    public Outter() {

    }

    static class Inner {
        public Inner() {

        }
    }

}
