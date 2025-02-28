## 类型

```java
1. 基本类型 primitive (原始 简单)
    byte short int long float double char boolean
2. 引用类型 reference type都是Object的子类型
    String (byte[] -> byte)
    byte[]
    int[]
    Phone (double String)
    Student
    Calculator
3. 包装类型
    Byte Short Integer Long Float Double Character Boolean
```

## 1. 基本类型之间转换规则

![微信截图_20250221193822.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250221193822.png)

```java
    顺箭头 隐式转换(自动),向上转型
    逆箭头 强制转换, 可能损失精度，向下转型
byte a = 10;
int b = a;

int c = 1000;
byte d = (byte) c; //先把 int 类型的 c 转换为 byte 类型，再将转换后的结果存储到 d 变量中
System.out.println(d);
```

## 2. 包装类型与基本类型之间转换规则
![微信截图_20250221194606.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250221194606.png)

```java
int a = 20;
Integer b = a;//自动装箱Autoboxing

Integer c = new Integer(30);
int d = c;
```

## 3. 引用类型之间转换规则

![微信截图_20250221203522.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250221203522.png)


```java
                继承特点
 1) 单继承, 子类只能继承一个父类
1) Object 是其它类型直接或间接的父类型, 定义 class 时, 不写 extends 此类也是继承自 Object
2) 子类与父类、祖先类型之间，可以用【是一个 is a】的关系来表达

a. 顺箭头 (待转换的对象和目标类型之间 要符合【是一个】的关系) 隐式转换, 向上转型, 使用父类型统一处理子类型
b. 逆箭头 (待转换的对象和目标类型之间 要符合【是一个】的关系) 强制转换, 向下转型, 将对象还原
                               cat    dog
        
        Animal a = new Cat();  // 对象还是那个对象, 只是用父类型来代表了它
        Object b = new Cat();
//        Appliance c = new Cat(); // 不合法

        Cat c = (Cat) a;
//        Dog d = (Dog) a; // 不行!!!a 是 new Cat()，它的真实类型是 Cat，只是用 Animal 类型的引用来表示它（向上转型，隐式转换）。尝试向下转型成 Dog，但 a 实际上是 Cat，这不符合继承关系。 ClassCastException

        Cat e = (Cat) b; // 可以
//        Dog f = (Dog) b; // 不行 类型转换异常 ClassCastException
        Animal g = (Animal) b; // 可以
```

## 4.获取/判断对象的真正类型

```java
System.out.println(a.getClass()); // 获取它所代表对象的真正类型,getClass其实是Object的方法
System.out.println(b.getClass()); // 获取它所代表对象的真正类型
```

```java
// 对象 instanceof 类型, 作用：检查对象和类型之间是否符合【是一个】的关系,经常用在向上转型之前做判断
System.out.println(a instanceof Cat);
System.out.println(a instanceof Dog);
System.out.println(b instanceof Animal);
```

## 5.接口和实现类的关系

![](java_15_类型.assets/微信截图_20250225213341.png)

```
//ArrayList可以向上转型为list类型

List<Integer> list1 = new ArrayList<>();
```

```java
package com.itheima.module4;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();//Arraylist可以隐式转化为list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1.getClass());

        List<Integer> list2 = List.of(1,2,3,4);
        System.out.println(list2.getClass());

        List<Integer> list3 = List.of(1,2);
        System.out.println(list3.getClass());
        /**
         * List.of一旦确定就不能改变集合，比如不能再add元素
         */
        list1.addAll(list2);
        System.out.println(list1);

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(List.of(1,2,3,4,5));
        System.out.println(list4);
    }
}
```