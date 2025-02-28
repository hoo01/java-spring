package com.itheima.encapsulation;

import java.io.Serializable;

/**
 * javabean规范
 * 1.字段私有，public方法来访问私有字段 get set is
 * 2.最好提供一个无参的构造
 * 3.最好实现一个接口Serializable
 * 4.javabean里一般只封装数据，除了get set,没有其他包含复杂逻辑的方法
 * 5.如果javabean对象的字段里只要有get、set方法其中之一，就称该java bean有一个xxx属性（property）

 */
public class TestJavaBean {
    public static void main(String[] args) {
        Teacher t = new Teacher("zhangsan",false);
        System.out.println(t.getName());
        System.out.println(t.isMarried());
        t.setMarried(true);//更改婚姻状态
        System.out.println(t.isMarried());
    }
}

/**
 * 以下为第一种 字段私有，public方法来访问私有字段 get set is
 */
class Teacher implements Serializable {
    private String name; //小写
    private boolean married; //已婚
    private int age;

    //get 方法 用来获取私有字段值
    public String getName() { //get 后面首字母要大写
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() { //对boolean类型用is
        return this.married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
//无参构造方法：符合规范
    public Teacher() {
    }
//有参构造方法 更简便的方法来初始化对象
    public Teacher(String name, boolean married) {
        this.name = name;
    }
}
