package org.example;


public class Modulo {



    public static int calculadora(String o, int a, int b) {

    int c= 0;
        if (o.equalsIgnoreCase("+")) {
            c= a + b;
        }else
            if (o.equalsIgnoreCase("-")) {
            c= a - b;
        }else
            if (o.equalsIgnoreCase("*")) {
            c= a * b;
        }else
            if (o.equalsIgnoreCase("/")) {
            c= a / b;
        } else {
            System.out.println("ingrese un operador valido");
        }


        return c;
    }







}

