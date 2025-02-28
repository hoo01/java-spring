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
