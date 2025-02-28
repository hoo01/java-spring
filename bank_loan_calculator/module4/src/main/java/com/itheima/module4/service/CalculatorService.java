package com.itheima.module4.service;

import com.itheima.module4.dto.Calculator;

import java.text.NumberFormat;

/**
 * 业务逻辑接口
 */

public interface CalculatorService {

    String[] cal(Calculator c);//加一个抽象方法，这样就可以使用实现类中重写后的方法
    String[][] details(Calculator c);
    //接口里的方法，必须有default
    default String[] createRow(int i,double payment,double payPrincipal,double payInterest, double p) {
        String[] row = new String[]{                       // 一行的数据
                (i + 1) + "",
                NumberFormat.getCurrencyInstance().format(payment),
                NumberFormat.getCurrencyInstance().format(payPrincipal),
                NumberFormat.getCurrencyInstance().format(payInterest),
                NumberFormat.getCurrencyInstance().format(p)
        };
        return row;
    }
}
