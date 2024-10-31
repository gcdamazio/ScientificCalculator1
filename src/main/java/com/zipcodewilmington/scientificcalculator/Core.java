package com.zipcodewilmington.scientificcalculator;


import java.lang.Math;
import java.util.Scanner;

public class Core {
    public double sum(double input1,double input2) {
        return input1 + input2;
    }
    public double subtract(double input1,double input2) {
        return input1 - input2;
    }
    public double multiply(double input1,double input2) {
        return input1 * input2;
    }
    public double divide(double input1,double input2 ) {
        return input1 / input2;
    }
    public double square(double input1) {
        return Math.pow(input1, 2);
    }
}