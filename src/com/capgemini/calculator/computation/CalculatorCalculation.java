package com.capgemini.calculator.computation;

public class CalculatorCalculation implements Calculation{
    @Override
    public double doCalculation(int firstNumber, int secondNumber, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }
}
