## 前提

java 中的类型系统允许用父类型代表子类型对象，这是多态前提之一。

子类和父类之间发生了方法重写，这是多态前提之二

## 效果

调用父类型的方法，可能会有不同的行为，取决于该方法是否发生了重写

## 什么时候使用多态

多态能够用一个父类型，统一操作子类对象
很多if else 的地方，都可以考虑使用多态来消除 if else，提高扩展性

```java
package com.itheima;

public class TestAnimal {
    public static Animal[] getAnimals() {
        return new Animal[] {//组里存放的 实际上是 Cat、Dog、Pig 这些子类对象，只是它们被存储为 Animal 类型。
                new Cat(),//new 是实例化类的唯一方式，通过它可以获得类的具体对象。
                new Dog(),
                new Pig()

        };
    }
    public static void main(String[] args) {
        //类型名 变量名 = 调用方法
        Animal[] animals = getAnimals();
        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i]; //向上转型，这里的 a 可以是 Cat、Dog、Pig,即用 父类类型的变量 存储 子类的对象
            a.say();
        }
    }
}

class Animal {
    void say() {}
}


class Cat extends Animal{
    void say() {
        System.out.println("mew mew");
    }
}

class Dog extends Animal{
    void say() {
        System.out.println("arf arf");
    }
}

class Pig extends Animal{
    void say() {
        System.out.println("hum hum");
    }
}
```