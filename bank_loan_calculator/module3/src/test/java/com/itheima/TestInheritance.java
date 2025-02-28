package com.itheima;

public class TestInheritance {
    public static void main(String[] args) {
        B b = new B("阿狗");
        System.out.println(b.name);
        b.test();
    }
}

class A {

    String name;

    public A(String name) {
        this.name = name;
    }

    void test() {
        System.out.println("父类继承方法");
    }
}

class B extends A{
    //父类有构造方法时，子类必须也有自己的构造，去调父类的构造
    B(String name) {
        //super()
        super(name);
    }
}

