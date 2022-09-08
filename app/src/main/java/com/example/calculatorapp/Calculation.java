package com.example.calculatorapp;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class Calculation {

    public double addTwoNumbers(double a, double b) {
        return a + b;
    }

    public double subtractTwoNumbers(double a, double b) {
        return a - b;
    }

    public double multiplyTwoNumbers(double a, double b) {
        return a * b;
    }

    public double divideTwoNumbers(double a, double b) {
        return a / b;
    }

    public double calculatePercentage(double a) {
        return a / 100;
    }


}
