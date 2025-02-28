package com.itheima.a;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本金");
        double p = scanner.nextDouble();
        System.out.println("请输入年利率");
        double yr = scanner.nextDouble();
        double mr = yr / 12.0 / 100;
        System.out.println("请输入还款月数");
        int m = scanner.nextInt();
        double pay = Math.pow(1+mr,m);
        double payment = p * mr * pay / (pay - 1);
        System.out.println(NumberFormat.getCurrencyInstance().format(payment));
    }
}
