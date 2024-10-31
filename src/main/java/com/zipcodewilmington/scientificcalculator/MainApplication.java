package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */

/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {
    public static void main(String[] args) {
        //colors
        String reset = "\u001B[0m";
        String yellow = "\u001B[33m";
        String cyan = "\u001B[36m";
        String purple = "\u001B[35m";

        System.out.println(cyan + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + reset);
        System.out.println(cyan + "|" + reset + yellow + "   Welcome to Xylophanes Calculator!    "  + reset + cyan +
                "|" + reset);
        System.out.println(cyan + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + reset);
        System.out.println();

        boolean running = true;
        while (running) {
            System.out.println("How can I help you today?");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Square");
            System.out.println("5: Exit");

            String choice = Console.getStringInput("Enter your choice or any operator:");


            if (choice.equals("5") || choice.equals("exit")) {
                running = false;
                Console.println("[Exiting the calculator...]");
                System.out.println(yellow + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|" + reset + purple + "   Numbers crunched, answers found. Thanks for using our calculator!    " + reset + yellow +
                        "|");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + reset);
                System.out.println();
                continue;

            }
            else if(choice == "1") {
                double input1 = Console.getDoubleInput("Enter first number:");
                double input2 = Console.getDoubleInput("Enter second number:");
                Double result = Console.Calculation(choice, input1, input2);
                System.out.println("\n" + purple + "The result of your calculation is: " + result + reset);
            }
            else if(choice == "3") {
                double input1 = Console.getDoubleInput("Enter first number:");
                Double result = Console.Calculation2(choice, input1);
                System.out.println("\n" + purple + "The result of your calculation is: " + result + reset);
            }
//            else {
//                System.out.println("Sorry invalid operator");
//            }
        }

    }
}