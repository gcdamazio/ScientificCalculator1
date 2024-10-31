package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextInt();
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextDouble();
    }

    public static Double Calculation(String operator, double x, double y) {
        Core core = new Core();

        switch (operator) {
            case "1":
            case "+":
            case "plus":
            case "add":
                return core.sum(x, y);
            case "2":
            case "-":
            case "subtract":
            case "minus":
                return core.subtract(x, y);
            default:
                println("---Can not recognize operator. Try again!---");
                return null;
        }
    }
}

