package com.itheima.module4;

public class TestThrows {
    public TestThrows() {
    }

    public static void main(String[] args) throws Exception {
        test3(0.0);
    }

    public static void test1(double p) {
        if (p <= 0.0) {
            throw new IllegalArgumentException("本金必须大于 0");
        } else {
            System.out.println(2);
        }
    }

    /**
     * 选择1：自己处理异常 try - catch 捉住异常
     * @param p
     */
    public static void test2(double p) {
        if (p <= 0.0) {
            try {
                throw new Exception("本金必须大于 0");
            } catch (Exception var3) {
            }
        }

        System.out.println(2);
    }

    /**
     * 选择2：由上一层方法来处理，用throws可能出现的异常类型
     */
    public static void test3(double p) throws Exception {
        if (p <= 0.0) {
            throw new Exception("本金必须大于 0");
        } else {
            System.out.println(2);
        }
    }
}
