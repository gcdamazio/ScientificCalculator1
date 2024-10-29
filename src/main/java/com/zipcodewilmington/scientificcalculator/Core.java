package com.zipcodewilmington.scientificcalculator;


import java.lang.Math;
import java.util.Scanner;

public class Core {

    public double square(double input1) {
        double pow = Math.pow(input1, 2);
        return pow;
    }
    public double squareRoot(double input1) {
        double sqrt = Math.sqrt(input1);
        return sqrt;
    }
    public double exp(double input1, double input2) {
        double pow2 = Math.pow(input1, input2);
        return pow2;
    }
    public double sum(double input1,double input2) {
        return input1 + input2;
    }
    public Double subtract(double input1,double input2) {
        return input1 - input2;
    }
    public Double multiply(double input1,double input2) {
        return input1 * input2;
    }
    public Double divide(double input1,double input2 ) {
        return input1 / input2;
    }





}