## 一、有参数的构造方法

自动生成构造方法
![微信截图_20250220152706.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250220152706.png)

![微信截图_20250220152718.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250220152718.png)
![微信截图_20250220152732.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250220152732.png)
![微信截图_20250220152748.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250220152748.png)
## 二、无参数的构造方法

Student.java

```java
package main.itheima;

public class Student {
    public String name;
    public int age;

    public Student() {
    }
}
```

TestStudent.java

```java
package test;
import main.itheima.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "lily";
        s1.age = 18;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
```

方法分成两类，
方法执行需要的数据来源**全部来自方法参数，就是 static 方法**
部分来自于**对象内部的，就是对象方法**