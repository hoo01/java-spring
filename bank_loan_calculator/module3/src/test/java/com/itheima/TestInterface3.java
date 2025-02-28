package com.itheima;

public class TestInterface3 {
    public static void main(String[] args) {
        M m = new N();
        m.m();

    }

}

interface M{
    //抽象方法没有方法体
    void m();
}

class N implements M {
    public String name;
    @Override
    public void m() {
        System.out.println("m");
    }
    public void n() {
        System.out.println("n");
    }
}
