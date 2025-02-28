
![微信截图_20250220102349.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250220102349.png)

### 1. **基本语法结构**：

```java
public class ClassName {
    // 类的字段（成员变量）
    
    // 类的构造方法
    
    // 类的方法（成员方法）

    // 可选的静态块、构造方法、内部类等
}
```

### 2. **详细解释**：

- **class**: 关键字，表示定义一个类。
- **ClassName**: 类的名称。类名一般使用大写字母开头的驼峰命名法（CamelCase）。
- **public**: 访问修饰符，表示这个类可以被其他类访问。也可以使用其他修饰符（如 `private`，`protected`，`default`）。

### 3. **示例**：一个简单的类定义

```java
public class Person {
    // 类的字段（成员变量Instance Variables）
    private String name;
    private int age;

    // 构造方法名必须与类名相同
    //构造方法与普通方法的最大不同是：构造方法没有返回类型，即使是void也不可以
    public Person(String name, int age) {
        //字段名 = 方法参数名
        //this避免重名，方法参数名比字段名级别更高，如果重名会两边都默认为参数名，出现错误
        this.name = name;
        this.age = age;
    }

    // 成员方法（实例方法）
    // 如果方法声明 void，就不能 return 任何值。
    // 如果方法声明 double，必须 return 一个 double 类型的值。
    public void greet() {
        System.out.println("Hello, my name is " + name);
    }

    // 主方法 - 用于执行类中的代码
    public static void main(String[] args) {
        // 创建对象！！！有new说明调用了构造方法
        Person p = new Person("Alice", 30);
        p.greet();  // 调用方法
    }
}
```

### 4. **类中的常见组件**：

- **字段**（成员变量）：用于表示类的属性。

- **构造方法**：初始化类对象。

  ！错误的构造方法

  ```java
  // 这个会报错，因为构造方法不能有返回类型
  public void Person(String name, int age) {  
      this.name = name;
      this.age = age;
  }
  ```
  *构造方法的主要目的就是初始化类的对象，而不需要返回任何值。由于这个原因，Java规定构造方法**不能有返回类型**，即使是 `void` 也不能使用。构造方法只是用来创建对象，并将其初始化到一个有效的状态，而不是用来返回任何数据。这是它和普通方法的一个重要区别。*
  
  
- **方法**：定义类的行为，操作类的字段。
- **静态变量/方法**：使用 `static` 关键字来定义类的静态成员，属于类本身，而不是对象。
- **内嵌类/匿名类**：可以定义类内部的类。

### 5. **常见访问修饰符**：

- **public**: 类、方法、字段可以被任何类访问。
- **private**: 类、方法、字段只能在同一个类内部访问。
- **protected**: 允许同一个包内的类和子类访问。
- **default**: 没有指定修饰符时，默认使用包访问权限，只有同一个包内的类可以访问。