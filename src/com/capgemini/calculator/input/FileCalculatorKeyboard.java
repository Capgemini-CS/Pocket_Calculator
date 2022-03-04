package com.capgemini.calculator.input;

import com.capgemini.calculator.util.FileScanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCalculatorKeyboard implements Keyboard {
    @Override
    public String getOperator() {
        return FileScanner.getRequestedOperator();
    }


    @Override
    public int getFirstNumber() {
        return FileScanner.getRequestedNumbers()[0];
    }

    @Override
    public int getSecondNumber() {
        return FileScanner.getRequestedNumbers()[1];
    }
}
