package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public double divide(int c) {
        return (double) c / x;
    }

    public double sumAllOperation(int s) {
        return sum(s) + multiply(s) + minus(s) + divide(s);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        int rslMinus = minus(3);
        Calculator calculator = new Calculator();
        double rslDivide = calculator.divide(4);
        double rslSumAll = calculator.sumAllOperation(3);
        System.out.println("Minus = " + rslMinus + "\nDivide = " + rslDivide
                + "\nSumAll = " + rslSumAll);
    }
}
