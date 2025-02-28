package com.itheima.module4.service.impl;

import com.itheima.module4.dto.Calculator;
import com.itheima.module4.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;

/**
 * 业务逻辑类 - 等额本金方式
 */
@Service
public class CalculatorService2 implements CalculatorService {

    public CalculatorService2() {
        System.out.println("Service2 被创建了");
    }

    public String[] cal(Calculator c) { //从专门存数据的Calculator.java里get取出需要的数据
        double p =c.getP();
        return new String[] {
                NumberFormat.getCurrencyInstance().format(p),
                "0"
        };
    }

    public String[][] details(Calculator c) {
        int m = c.getM();
        double p = c.getP();

        String[][] a2 = new String[m][];
        double payment = p/m;
        for (int i = 0; i < m; i++) {
            p -= payment;
            a2[i] = createRow(i,payment,payment,0,p);
        }
        return a2;
    }
}