package org.Task3;

public class Pair <T, F> {
    private T valueOfT;
    private F valueOfF;

    public Pair(T valueOfT, F valueOfF) {
        this.valueOfT = valueOfT;
        this.valueOfF = valueOfF;
    }

    public T getFirst() {
        return valueOfT;
    }

    public F getSecond() {
        return valueOfF;
    }

    @Override
    public String toString() {
        return "Первое значение: " + valueOfT + "\nВторое значение: " + valueOfF;
    }
}
