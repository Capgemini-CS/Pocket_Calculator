package com.capgemini.calculator;

import com.capgemini.calculator.computation.CalculatorCalculation;
import com.capgemini.calculator.input.HardCodedCalculatorKeyboard;
import com.capgemini.calculator.screen.CalculatorScreen;

public class Calculator {

    HardCodedCalculatorKeyboard hardCodedCalculatorKeyboard = new HardCodedCalculatorKeyboard();
    int firstNumber = hardCodedCalculatorKeyboard.getFirstNumber();
    int secondNumber = hardCodedCalculatorKeyboard.getSecondNumber();
    String operator = hardCodedCalculatorKeyboard.getOperator();


    CalculatorCalculation calculation = new CalculatorCalculation();
    double result = calculation.doCalculation(firstNumber, secondNumber, operator);

    CalculatorScreen calculatorScreen = new CalculatorScreen();



}
