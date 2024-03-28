package org.example;

import java.util.Scanner;

import static org.example.Modulo.calculadora;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
/*
// calculadora
        System.out.println("ingresa un numero: ");
        int a = teclado.nextInt();
        System.out.println("ingrese otro numero: ");
        int b = teclado.nextInt();
        System.out.println("elija el operador: + , - , * , / .");
        String operador = teclado.next();
        System.out.println("el resultado es: " + calculadora(operador,a,b));
        System.out.println("");

*/


/*
//Ejercicio 1: calculadora IMC (indice masa corporal) .

        double peso,altura,imc;
        String indCategoria;

        System.out.println("por favor ingrese su peso en kg: ");
        peso = teclado.nextDouble();
        System.out.println("por favor ingrese su altura en Metros: ");
        altura = teclado.nextDouble();

        imc = peso / (altura * altura);

       if (imc < 18.5){
            indCategoria = "peso normal";
        } else if (imc >=18.5 && imc<25) {
            indCategoria= "Normal";
        } else if (imc  >=25 && imc < 30) {
            indCategoria= "sobre peso";
        } else {
            indCategoria="obesidad";
        }

        System.out.println("su IMC es: "+ imc);
        System.out.println("usted se encuentra en la categoria de: "+ indCategoria);
*/

       /* Ejercicio 2:Desarrolla un programa que permita al usuario convertir una cantidad de pesos
        argentinos a dolares.El usuario
        debe ingresar la cantidad en pesos,
        y el programa debe realizar la conversión y mostrar el resultado.
                Utiliza una tasa de conversión fija.*/

       /* double pesos, total;
        final double vDollar = 875.5;

        System.out.println("ingrese la cantidad de pesos que quiere convertir a dollar: ");
        pesos = teclado.nextDouble();

        total = pesos * vDollar;

        System.out.println("la cantidad de dolares es: \n" + total);*/


       /* Ejercico 3: Crea un programa que solicite al usuario ingresar una contraseña. El programa debe validar la contraseña
        según el criterio de una longitud mínima caracteres. Ingrese nuevamente la contraseña y corroborar que ambas sean iguales.*/

        System.out.println("ingrese una contrasenia. debe tener almenos 8 caracteres");
        String contrasenia = teclado.next();


        while (contrasenia.length() < 8) {
            System.out.println("recuerde debe tener almenos 8 caracteres. \n por favor intentelo de nuevo ");
            contrasenia = teclado2.next();
        }
        System.out.println("ingrese nuevamente su contrasenia");
        String confContrasenia = teclado2.next();

        while (!confContrasenia.equals(contrasenia)) {
            System.out.println("contrasenia incorrecta \n intentelo de nuevo");
            confContrasenia = teclado2.next();
        }

        System.out.println("contrasenia correcta"); 




    }
}