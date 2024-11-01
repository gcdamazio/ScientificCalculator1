package com.zipcodewilmington.scientificcalculator;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        String[] listOfOperations = {"0", "Add", "Subtract", "Square", "Square Root", "Multiply" , "Divide", "Exponential", "Percentage", "Log Value", "Invert Sign", "Sine", "Cosine","Tangent","Inverse Log","Natural Log","Inverse Natural Log","Exit"};
        while (running) {
            System.out.println("How can I help you today?");
            for (int i = 1; i <= 17; i ++){
                System.out.println(i + ". " + listOfOperations[i]);
            }
            /*System.out.println(" 1: Add");
            System.out.println(" 2: Subtract");
            System.out.println(" 3: Square");
            System.out.println(" 4: Square Root");
            System.out.println(" 5: Multiply");
            System.out.println(" 6: Divide");
            System.out.println(" 7: Exponential");
            System.out.println(" 8: Percentage");
            System.out.println(" 9: Log Value");
            System.out.println(" 10:Invert Sign");
            System.out.println(" 11:Sine");
            System.out.println(" 12:Cosine");
            System.out.println(" 13:Tangent");
            Inverse Log
            Natural Log
            Inverse Natural Log


            System.out.println(" 12:Exit");*/

            String choice = Console.getStringInput("\nEnter your choice or any operator:");
            Set<String> set1 = new HashSet<>();
            set1.addAll(Set.of("3","4","10","11", "12", "13", "14", "15", "16"));
            Set<String> set2 = new HashSet<>();
            set2.addAll(Set.of("1","2","5","6","7","8","9"));
            //String[] list1 ={"3","4","10"};
            //String[] list2 ={"1","2","5","6","7","8","9"};

            if (choice.equals("17") || choice.equals("exit")) {
                running = false;
                Console.println("[Exiting the calculator...]");
                System.out.println(yellow + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|" + reset + purple + "   Numbers crunched, answers found. Thanks for using our calculator!    " + reset + yellow +
                        "|");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + reset);
                System.out.println();
                continue;

            }
            else if(set2.contains(choice)) {
                double input1 = Console.getDoubleInput("Enter first number:");
                double input2 = Console.getDoubleInput("Enter second number:");
                Double result = Console.Calculation(choice, input1, input2);
                System.out.println("\n" + purple + "The result of your calculation is: " + result + reset);
                //double memory = result;
            }
            else if(set1.contains(choice)) {
                double input1 = Console.getDoubleInput("Enter your number:");
                Double result = Console.Calculation2(choice, input1);
                System.out.println("\n" + purple + "The result of your calculation is: " + result + reset);
                //double memory = result;
            }
        else {
                System.out.println("---Can not recognize operator. Try again!---");
           }
        }

    }
}