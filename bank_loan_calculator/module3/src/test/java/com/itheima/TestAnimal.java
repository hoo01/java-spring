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
        Animal[] animals = getAnimals();
        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i]; //向上转型，这里的a可以是Cat、Dog、Pig,即用父类类型的变量存储子类的对象
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