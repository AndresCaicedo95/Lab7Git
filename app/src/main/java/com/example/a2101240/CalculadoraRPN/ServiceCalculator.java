package com.example.a2101240.CalculadoraRPN;

import java.io.IOException;

/**
 * Created by 2101240 on 3/8/17.
 */


public class ServiceCalculator {

    Rpn rpn = new Rpn();

    public ServiceCalculator(){

    }
    public double calcular(String s) {
        return rpn.calculadora(s);
    }
}
