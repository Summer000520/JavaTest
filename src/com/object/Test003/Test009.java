package com.object.Test003;

public class Test009 {

    public static void main(String[] args) {
        Test009 test009 = new Test009(0.99);

        Test009.Draw draw = new Test009(0.999).new Draw();

        draw.drawSahpe();

        Test009.Circle circle = new Test009(0.9999) .new Circle(0.88);

        circle.getDrawInstance().drawSahpe();

        Test009 test0091 = new Test009(0);
        test0091.test001();
    }

    void test001(){
        int a = 10;
        System.out.println(a);
        class Inner{
            void test(){
                System.out.println(a);
            }
        }

        Inner inner = new Inner();
        inner.test();
    }






    private double radius = 0;
    public static int count = 1;

    public Test009(double radius) {
        this.radius = radius;
    }

    class Draw {
        public void drawSahpe() {
            // 调用外部类的属性值
            System.out.println(radius);
            System.out.println(count);
        }
    }

    class Circle {
        private double radius = 0;
        public Circle(double radius) {
            this.radius = radius;
            //必须先创建成员内部类的对象，再进行访问
            getDrawInstance().drawSahpe();
        }

        private Draw getDrawInstance() {
            return new Draw();
        }

        class Draw {     //内部类
            public void drawSahpe() {
                //外部类的private成员
                System.out.println(radius);
            }
        }
    }
}
