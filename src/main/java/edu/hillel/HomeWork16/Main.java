package edu.hillel.HomeWork16;

public class Main {
    public static void main(String[] args) {
        int arraySize = 1_000_000;
        ValueCalculator calculator = new ValueCalculator(arraySize);
        calculator.calculateValues();
    }
}
