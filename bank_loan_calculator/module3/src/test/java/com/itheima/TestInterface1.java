package com.itheima;

/**
 * 接口 - 解决单继承问题
 * 1.需要放入接口的方法，必须加default关键字（默认方法）
 * 2.default方法只能是public，public可以省略
 * 3.一个java文件中，可以有多个接口，但只能有一个public
 * 4.类必须和源文件同名
 */

public class TestInterface1 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.swim();
        d.fly();
    }
}

interface Swimmable {
    default void swim() {
        System.out.println("Swim");
    }
}

interface Flyable {
    default void fly() {
        System.out.println("Fly");
    }
}

class Duck implements Swimmable, Flyable {

}