package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("TI84");
        int n1 = 2;
        int n2 = 3;
        int expectedOutput = 1;
        int studentOutput = calculator.absoluteValue(n1, n2);
        System.out.print(studentOutput);
        if (expectedOutput==studentOutput){
            System.out.print("True");
        }
    }
}
