**创建数组**
```package com.itheima.module2;
/*
    Array 数组可以存多个值
    1.类型 [] 变量名 = new 类型[长度]
    2.类型 [] 变量名 = new 类型[]｛元素1，元素2，...｝
    3.类型 [] 变量名 = ｛元素1，元素2，...｝
 */
public class TestArrat {
    public static void main(String[] args) {
        // new int[3]创建一个数组，能存3个整数
        // new String[2]创建一个数组，能存储2个字符串
        String[] a = new String[2];//定义数组

        a[0] = "hello"; //元素 索引（下标）
        a[1] = "world";
        System.out.println(a[0]);
        System.out.println(a[1]);

        //以下是方法2
        String[] b = new String[]{"hello", "world"};
        System.out.println(b[0]);
        System.out.println(b[1]);

        //以下是方法3
        String[] c = {"hello", "world"};
        System.out.println(c[0]);
        System.out.println(c[1]);
    }
}
```

##### 其他操作
```
package com.itheima.module2;

public class TestArray2 {
    public static void main(String[] args) {
        //数组的长度，一旦确定确定不能更改
        String[] a = new String[]{"北京", "上海", "深圳"};
        System.out.println("数组的长度" + a.length);
        //数组越界
        System.out.println(a[0]);
        //遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
```

##### 二维数组
`//String[][] 变量名 = new String[外层长度][内层长度]`
belike
```
@RequestMapping("/details")
@ResponseBody
String[][] details(double p, int m, double yr){
    // 先定义并初始化 row0、row1 和 row2
    String[] row0 = new String[]{"1","1-1","1-2","1-3"};
    String[] row1 = new String[]{"1","1-1","1-2","1-3"};
    String[] row2 = new String[]{"1","1-1","1-2","1-3"};
    //String[][] 变量名 = new String[外层长度][内层长度]
    //然后定义 a2，并将 row0、row1、row2 赋给 a2
    String[][] a2 = new String[3][];
    a2[0] = row0;
    a2[1] = row1;
    a2[2] = row2;
    return a2;
```

```
@RequestMapping("/details")
@ResponseBody
String[][] details(double yr, double p, int m){
        String[][] a2 = new String[m][];
        double mr = yr /12 /100;
        double pow = Math.pow(1 + mr,m);
        double payment = p * mr * pow / (pow - 1);
        for(int i = 0; i < m; i++){
            double payInterest = p * mr;
            double payPrincipal = payment - payInterest;
            p -= payPrincipal;
            String[] row = new String[]{
                    (i+1) + "",//变成字符串
                    NumberFormat.getCurrencyInstance().format(payment),
                    NumberFormat.getCurrencyInstance().format(payPrincipal),
                    NumberFormat.getCurrencyInstance().format(payInterest),
                    NumberFormat.getCurrencyInstance().format(p)
        };
        a2[i] = row;
    }
        return a2;
    }
}
```

