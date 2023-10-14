package org.Task_1;

import java.text.DecimalFormat;

public class Calculator {

    public static <T extends Number> double sum(T firstValue, T secondValue) {
        return firstValue.doubleValue() + secondValue.doubleValue();
    }

    public static <T extends Number> double multiply(T firstValue, T secondValue) {
        return firstValue.doubleValue() * secondValue.doubleValue();
    }

    public static <T extends Number> double divide(T firstValue, T secondValue) {
        return firstValue.doubleValue() / secondValue.doubleValue();
    }

    public static <T extends Number> double subtract(T firstValue, T secondValue) {
        return firstValue.doubleValue() - secondValue.doubleValue();
    }
}
