package com.example.a2101240.CalculadoraRPN;

import java.io.*;
import java.util.*;

public class Rpn {

    public Rpn(){

    }
    public double calculadora(String s){
            System.out.println(s);
            Stack<String> tks = new Stack<String>();
            tks.addAll(Arrays.asList(s.trim().split("[ \t]+")));
            double r=0.0;
            if (tks.peek().equals("")) {};
            try {
                r = evalrpn(tks);
                if (!tks.empty()) throw new Exception();
            }
            catch (Exception e) {System.out.println("error");}
        return r;
    }

    private static double evalrpn(Stack<String> tks) throws Exception {
        String tk = tks.pop();
        double x,y;
        try {x = Double.parseDouble(tk);}
        catch (Exception e) {
            y = evalrpn(tks);  x = evalrpn(tks);
            if (tk.equals("+"))  x += y;
            else if (tk.equals("-"))  x -= y;
            else if (tk.equals("*"))  x *= y;
            else if (tk.equals("/"))  x /= y;
            else if (tk.equals("Cos")) x=Math.cos(y);
            else if (tk.equals("sen")) x=Math.sin(y);
            else if (tk.equals("Tan")) x=Math.tan(y);
            else if (tk.equals("^")) x=Math.pow(y,2);
            else if (tk.equals("sqrt")) x=Math.sqrt(y);
            else if (tk.equals("%")) x/=100;
            else if (tk.equals("AC")) x = 0;
            else throw new Exception();
        }
        return x;
    }
}