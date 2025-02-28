package com.itheima.module4;

public class TestTry {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            test(0.0); //没有异常一切照旧，有异常配合 catch 语句处理异常
        } catch (Exception e) { //捕捉，用来获取异常对象，让程序恢复正常流程。
            // 语法：异常类型 变量
            System.out.println(e); //打印异常对象
        }
        System.out.println(3);
    }

    public static void test(double p) {
        if (p <= 0.0) {
            throw new IllegalArgumentException("p must be greater than zero");
        }
    }
}
