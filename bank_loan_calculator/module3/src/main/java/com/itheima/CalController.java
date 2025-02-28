package com.itheima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalController {

    /**
     * 以等额本息法计算还款总额和总利息
     *
     * @param p  本金
     * @param m  月份
     * @param yr 年利率
     * @return 字符串数组 [0]还款总额 [1]总利息
     */

    static void check(double p, int m, double yr, int type) {
        if (p <= 0) {
            throw new IllegalArgumentException("贷款金额必须>0");
        }
        if (m < 1 || m > 360) {
            throw new IllegalArgumentException("贷款月份必须在 1~360 之间");
        }
        if (yr < 1.0 || yr > 36.0) {
            throw new IllegalArgumentException("年利率必须在 1~36 之间");
        }
        if (type != 0 && type != 1 && type != 2) {
            throw new IllegalArgumentException("不支持的还款类型");
        }
    }

    Calculator[] getCalculator(double p, int m, double yr) {
        return new Calculator[] {
                new Calculator0(p,m,yr),
                new Calculator1(p,m,yr),
                new Calculator2(p,m,yr)
        };
    }

    @RequestMapping("/cal")
    @ResponseBody
    String[] cal(
            @RequestParam("p") double p,
            @RequestParam("m") int m,
            @RequestParam("yr") double yr,
            @RequestParam("type") int type)
    {
        check(p, m, yr, type);
        Calculator[] calculators = getCalculator(p, m, yr);
        Calculator c = calculators[type];//通过type获得对应的子类对象
        return c.cal();
    }

    @RequestMapping("/details")
    @ResponseBody
    String[][] details(@RequestParam("p") double p,
                       @RequestParam("m") int m,
                       @RequestParam("yr") double yr,
                       @RequestParam("type") int type) {
        check(p, m, yr, type);
        Calculator[] calculators = getCalculator(p, m, yr);
        Calculator c = calculators[type];//通过type获得对应的子类对象
        return c.details();
    }
}