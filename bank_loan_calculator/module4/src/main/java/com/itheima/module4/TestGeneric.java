package com.itheima.module4;

import java.util.ArrayList;

/**
 * <>泛型,只支持指定引用类型，不支持基本类型
 * 并且接下来放入的元素只能是指定的类型
 */
public class TestGeneric {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // <>泛型,只支持引用类型，不支持基本类型，后面的integer可以省略
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int sum = 0;
        for (Integer i : list){
            sum += i;

            System.out.println(sum);
        }
    }
}


