package com.itheima.module2;

public class Phone {

    String brand;
    String memory;
    String size;
    String color;
    double price;
    public boolean available = false;

    public Phone(String brand, String memory, String size, String color, double price) {
        this.brand = brand;
        this.memory = memory;
        this.size = size;
        this.color = color;
        this.price = price;
    }
//    public Phone(String brand, String memory, String size, String color, double price) {
//        //字段名 = 方法参数名
//        this.brand=brand;//避免重名，方法参数名比字段名级别更高，如果重名会两边都默认为参数名，出现错误
//        this.memory=memory;
//        this.size=size;
//        this.color=color;
//        this.price=price;
//    }
}
