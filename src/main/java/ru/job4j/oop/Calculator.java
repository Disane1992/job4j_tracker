package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rslMultiply = calculator.multiply(5);
        System.out.println(rslMultiply);
        int rslDivide = calculator.divide(3);
        System.out.println(rslDivide);
        int rslSum = sum(4);
        System.out.println(rslSum);
        int rslMinus = minus(5);
        System.out.println(rslMinus);
        int rsl = calculator.sumAllOperation(3);
        System.out.println(rsl);
    }
}
