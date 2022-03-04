package com.capgemini.calculator.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CsvLineParser {

    public static String getOperatorFromCsvLine(String line) {
        String[] fileAttributes = line.split(",");
        List<String> allowedOperands = new ArrayList<>(List.of("+", "-", "*", "/"));

        checkLength(fileAttributes);
        checkIfNull(fileAttributes);

        if (!allowedOperands.contains(fileAttributes[2])) {
            System.out.println("You should enter one of these operands {+, -, *, /}");
            System.exit(0);
        }

        return fileAttributes[2];
    }


    public static int[] getNumbersFromCsvLine(String line) {
        int[] numbers;
        String[] fileAttributes = line.split(",");

        checkLength(fileAttributes);
        checkIfNull(fileAttributes);

        if (isNotNumeric(fileAttributes[0]) || isNotNumeric(fileAttributes[1])) {
            System.out.println("You should have introduced numbers");
            System.exit(0);

        }

        int firstNumber = Integer.parseInt(fileAttributes[0]);
        int secondNumber = Integer.parseInt(fileAttributes[1]);

        numbers = new int[]{firstNumber, secondNumber};

        return numbers;


    }

    public static boolean isNotNumeric(String stringToNumber) {
        try {
            Integer.parseInt(stringToNumber);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

    private static void checkIfNull(String[] fileAttributes) {
        for (String attribute : fileAttributes) {
            if (Objects.isNull(attribute)) {
                System.exit(0);
            }
        }
    }

    private static void checkLength(String[] fileAttributes) {
        if (fileAttributes.length != 3) {
            System.out.println("Invalid file");
            System.exit(0);
        }
    }
}
