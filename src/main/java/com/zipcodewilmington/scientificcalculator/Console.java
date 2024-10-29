package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
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
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }

    public static Double Calculation (String operator, double x, double y) {
        Core core = new Core();
        int choice = 0;
        while (choice != 5) {
            System.out.println("Your operator");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    return core.subtract(x, y);
                }
                case 2: {
                    return core.multiply(x, y);
                }
                case 3: {
                    return core.exp(x, y);
                }
                case 4: {
                    return core.divide(x, y);
                }
                case 5: {
                    break;
                }
            }

        }

        return 0.0;
    }
}


