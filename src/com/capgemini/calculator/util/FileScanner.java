package com.capgemini.calculator.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileScanner {

    public static String getRequestedOperator() {
        String operator = "";
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/values.csv"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                try {
                    operator = CsvLineParser.getOperatorFromCsvLine(line);
                }
                catch (IllegalArgumentException e) {
                    System.err.println(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return operator;
    }

    public static int[] getRequestedNumbers() {
        int[] numbers = new int[2];
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/values.csv"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                try {
                    numbers = CsvLineParser.getNumbersFromCsvLine(line);
                }
                catch (IllegalArgumentException e) {
                    System.err.println(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}
