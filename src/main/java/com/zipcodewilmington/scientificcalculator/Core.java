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

    public double squareRoot(double input1) {
        return Math.sqrt(input1);
    }

    public double exp(double input1, double input2) {
        double pow2 = Math.pow(input1, input2);
        return pow2;
    }

    public double invertSign(double input1) {
        return input1 = -input1;
    }

    public double inverse(double input1) {
        return input1 = 1 / input1;
    }

    public Double percentage(double input1 ,double input2){
        return (input1 / input2) * 100;
    }

    public double logValue(double input1,double input2){
        return Math.log(input1) / Math.log(input2);
    }

    public double inverseLog(double input1){
        return Math.exp(Math.log(input1));
    }

    public double naturalLog(double input1){
        return Math.log(input1);
    }

    public double inverseNatLog(double input1){
        return Math.exp(input1);
    }

    public double sine(double input1) {
        return Math.sin(input1);
    }

    public double cosine(double input1) {
        return Math.cos(input1);
    }

    public double tangent(double input1) {
        return Math.tan(input1);
    }

    public double inverseSine(double input1) {
        return 1/Math.sin(input1);
    }

    public double inverseCosine(double input1) {
        return 1/Math.cos(input1);
    }

    public double inverseTangent(double input1) {
        return 1 / Math.tan(input1);
    }

    public double factorial(double input1){
        double result = 1;
        double floorNum = Math.floor(input1);
        for ( double i = floorNum; i > 0; i--){
            result = result * i;
        }
        return result;
    }
//    public double memoryCall(){
//        double memory = 0;
//        return memory;
//    }
}