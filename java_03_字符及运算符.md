![微信截图_20250217164521.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250217164521.png)
![微信截图_20250217165452.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250217165452.png)


##### 字符类型
char字符值
string字符串值，文本块

![微信截图_20250217184246.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250217184246.png)

##### 整数类型

byte

int

short

long

##### 小数类型

float

double
![微信截图_20250217170140.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250217170140.png)
##### **类型 变量名 = 值**

例如

var scanner = new Scanner(System.in)

**为什么有new**

| **情况**                     | **是否需要 `new`** | **示例**                                    |
| ---------------------------- | ------------------ | ------------------------------------------- |
| **普通对象**                 | ✅ 需要             | `Scanner scanner = new Scanner(System.in);` |
| **数组（字面量初始化）**     | ❌ 不需要           | `String[] arr = {"a", "b", "c"};`           |
| **数组（动态创建）**         | ✅ 需要             | `String[] arr = new String[3];`             |
| **基本数据类型**             | ❌ 不需要           | `int a = 10;`                               |
| **包装类（推荐 `valueOf`）** | ✅ 可选             | `Integer num = Integer.valueOf(10);`        |
| **Java 10 `var`**            | ❌ 但对象仍需 `new` | `var list = List.of(1, 2, 3);`              |

++ 自加1

-- 自减1
![微信截图_20250217185124.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250217185124.png)

*逻辑运算符**

![微信截图_20250217205007.png](https://cdn.jsdelivr.net/gh/hoo01/image_auto/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20250217205007.png)
