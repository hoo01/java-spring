# 接口特性2 - 多态

## 方法多态的两个条件

 * ### 1.用父类型代表子类对象,或者用接口类型代表实现类对象

```java
package com.itheima;

public class TestInterface2 {
    public static void main(String[] args) {
        E[] array = new E[] {
                new F(),
                new G()
        };
    }
}

interface E {

}

class F implements E {

}

class G implements E {

}
```

### 2.实现类（调用接口的类）重写接口方法

```java
public class TestInterface2 {
    public static void main(String[] args) {
        E[] array = new E[] {
                new F(),
                new G()
        };
        for (int i = 0; i < array.length; i++) {
            E e = array[i];
            e.e();//多态
        }
    }
}

interface E {
//    //默认方法实现，这里其实省略了public
//    default void e() {
//        System.out.println("e");
//    }

    /**抽象方法 只有方法声明，没有方法体
     * 1.只能是public，public abstract都能省略
     * 2.为什么不需要方法体？子类里有方法的话,父类里的方法也用不到
     * 3.实现类，必须重写接口的抽象方法
     */
    public abstract void e();
}

class F implements E {
    /**子类和实现类 方法访问修饰符 >= 父类和接口 方法访问修饰符
     * public > protected > 默认 > private
     */
    @Override
    public void e() {
        System.out.println("f");
    }
}

class G implements E {
    @Override
    public void e() {
        System.out.println("g");
    }
}
```