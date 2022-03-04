package com.capgemini.calculator.input;

public class HardCodedCalculatorKeyboard implements Keyboard{
    @Override
    public String getOperator() {
        return "+";
    }

    @Override
    public int getFirstNumber() {
        return 2;
    }

    @Override
    public int getSecondNumber() {
        return 4;
    }
}
