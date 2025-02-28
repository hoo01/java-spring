package com.itheima;

import java.text.NumberFormat;

public class Calculator1 extends Calculator{

    public Calculator1(double p, int m, double yr) {
        super(p, m, yr);
    }
    /*
    这个方法不是 static，意味着 它属于某个实例（对象），必须通过 Calculator0 的实例调用。
由于 cal0() 是实例方法，它 可以直接访问该对象的属性（p, m, yr），不需要额外创建新对象。
     */
    String[] cal() {
        double payPrincipal = p / m;        // 偿还本金
        double backup = p;                  // 备份本金
        double mr = yr / 12 / 100.0;
        double payInterestTotal = 0.0;      // 总利息
        for (int i = 0; i < m; i++) {
            double payInterest = p * mr;    // 偿还利息
            p -= payPrincipal;              // 剩余本金
            payInterestTotal += payInterest;
        }
        // [0]还款总额   [1]总利息
        return new String[]{
                NumberFormat.getCurrencyInstance().format(backup + payInterestTotal),
                NumberFormat.getCurrencyInstance().format(payInterestTotal)
        };
    }
    String[][] details() {
        // 等额本金
        double payPrincipal = p / m;                        // 偿还本金
        double mr = yr / 12 / 100.0;
        String[][] a2 = new String[m][];
        for (int i = 0; i < m; i++) {
            double payInterest = p * mr;                    // 偿还利息
            p -= payPrincipal;                              // 剩余本金
            double payment = payPrincipal + payInterest;    // 月供
            a2[i] = createRow(i,payment,payPrincipal,payInterest);
        }
        return a2;
    }
}
