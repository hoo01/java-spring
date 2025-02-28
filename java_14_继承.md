继承父类实例方法时，自动继承

```java
class A {
    String name;

    void test() {
        System.out.println("父类的 test() 方法");
    }
}

class B extends A {
    // 子类 B 没有重写 test() 方法，所以自动继承了父类的实现
}

class C extends A {
    // 子类 C 重写了 test() 方法,@Override检查重写方法是否有问题
    @Override
    void test() {
        System.out.println("子类 C 重写的 test() 方法");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.test();  // 调用父类 A 中的 test() 方法

        C c = new C();
        c.test();  // 调用子类 C 中重写的 test() 方法
    }
}

```

输出结果：

```java
父类的 test() 方法
子类 C 重写的 test() 方法
```



父类一旦有带参构造，子类必须有super()来调用父类的带参构造

```java
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
```