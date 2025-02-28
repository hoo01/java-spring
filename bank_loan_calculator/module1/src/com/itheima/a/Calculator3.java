package com.itheima.a;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        double p = inputAndCheckP();
        double mr = inputAndCheckMr();
        int m = inputAndChechM();
        double payment =Calculator3.calculate(p,mr,m);//使用自建方法
        printDetails(p,mr,m,payment);
    }

    static double inputAndCheckP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本金");
        double p = scanner.nextDouble();
        if (p <= 0) {
            throw new IllegalArgumentException("贷款金额必须 > 0");
        }
        return p;
    }

    static double inputAndCheckMr() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入年利率");
        double yr = scanner.nextDouble();
        if (yr < 1.0 || yr > 36.0) {
            throw new IllegalArgumentException("年利率必须在1-36之间");
        }
        double mr = yr / 12.0 / 100;
        return mr;
    }

    static int inputAndChechM() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入还款月数");
        int m = scanner.nextInt();
        if(m < 0 || m > 360) {
            throw new IllegalArgumentException("贷款月数须在1-360之间");
        }
        return m;
    }

    static void printDetails(double p, double mr, int m, double payment) { //没有return一个值，只是打印操作，所以返回类型是void
        for(int i = 0; i < m ; i++) {
            double payInterest = p * mr ; //本月偿还利息
            double payPrincipal = payment - payInterest; //偿还本金
            p -= payPrincipal; //剩余本金
            System.out.print("月份"+(i+1));//不换行
            System.out.print("\t本月还款" + NumberFormat.getCurrencyInstance().format(payment));//缩进
            System.out.print("\t偿还本金" + NumberFormat.getCurrencyInstance().format(payPrincipal));
            System.out.print("\t偿还利息" + NumberFormat.getCurrencyInstance().format(payInterest));
            System.out.println("\t剩余本金" + NumberFormat.getCurrencyInstance().format(p));
        }
        System.out.println("总还款额：" + NumberFormat.getCurrencyInstance().format(payment * m));
    }
    /**
     * 以等额本息的方式计算每月还款金额
     * @param p 本金
     * @param mr 月利率
     * @param m 还款月数
     * @return 每月还款金额
     */
    static double calculate(double p, double mr, double m) {
        double pow = Math.pow(1 + mr, m);
        return p * mr * pow / (pow - 1);
    }
}