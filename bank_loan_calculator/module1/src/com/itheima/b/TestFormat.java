package com.itheima.b;

import java.text.NumberFormat;
import java.util.Locale;

public class TestFormat {
    public static void main(String[] args) {
        String format = NumberFormat.getCurrencyInstance(Locale.US).format(8.791588723000991);
        System.out.println(format);
    }
}
