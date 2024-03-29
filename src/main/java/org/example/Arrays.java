package org.example;

import java.util.Scanner;

public class Arrays {

    public static Scanner teclado = new Scanner(System.in);
    public static Scanner teclado2 = new Scanner(System.in);
    public static final int CANT_MAXIMA = 100;
    public static int cantidadDeContactos=0;
    

    public static void main(String[] args) {


        /* ejercicio numero 1.
        int canNum = 0;
        System.out.println("ingrese la cantidad de numeros que desea ingresar");
        canNum = teclado.nextInt();
        
         int[] array = new int[canNum];

        for (int i = 0; i < array.length; i++) {
            System.out.println("ingrese el valor que quiere para la posicion: " + i);
            array[i] = teclado.nextInt();
        }
        
        System.out.println("el numero mayor es: "+ encontrarMaximo(array));
        System.out.println("el numero menor es: "+ encontrarMinimo(array));
        System.out.println("el promedio de los valores ingresados es: "+ calcularPromedio(array));
        System.out.println("la cantidad de numeros pares en el array es de: "+ contarNumerosPares(array));
        
        /*ejercicio numero 2.*/
        
        int opcion;
        
        String[] contactos = new String[CANT_MAXIMA];
        String[] telefonos = new String[CANT_MAXIMA];
        
        do{
            System.out.println("bienvenidos a la agenda ");
            System.out.println("1. agregar contactos");
            System.out.println("2.buscar contacto");
            System.out.println("3.mostrar todos los contactos");
            System.out.println("4.salir");
            System.out.println("ingrese su opcion");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                    agregarContacto(contactos,telefonos);
                    break;
                case 2:
                    buscarContacto(contactos,telefonos);
                    break;
                case 3:
                    mostrarContactos(contactos,telefonos);
                    break;
                case 4:
                    System.out.println("!hasta luego!!");
                    break;
                default:
                    System.out.println("por favor ingrese una opcion valida");
            }
            
        }while (opcion!=4);
            
        

    }

 



    public static int encontrarMaximo(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int encontrarMinimo(int[] array) {
        int min = 999999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        return min;
    }

    public static double calcularPromedio(int[] array) {
        int suma = 0;
        double promedio = 0.0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            promedio = suma / array.length;
        }
        return promedio;
    }

    public static int contarNumerosPares(int[] array) {
        int pares = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares = pares + 1;
            }
        }
        return pares;
    }

    private static void mostrarContactos(String[] contactos, String[] telefonos) {
       if(cantidadDeContactos>0){
           System.out.println("lista de contactos...");
           for (int i = 0; i < cantidadDeContactos; i++) {
               System.out.println("Nombre:"+" "+contactos[i]+" "+"Telefono:"+" "+telefonos[i]);
           }
       }else{
           System.out.println("No hay Contactos para Mostrar");
       }
    }

    private static void agregarContacto(String[] contactos, String[] telefonos) {
        
         if (cantidadDeContactos<CANT_MAXIMA){
            System.out.println("ingrese el nombre del nuevo contacto");
            String nombre = teclado2.next();
            System.out.println("ingrese el telefono del nuevo contacto");
            String telefono = teclado2.next();
            
            contactos[cantidadDeContactos]=nombre;
            telefonos[cantidadDeContactos]=telefono;
            
            cantidadDeContactos++;
            
            System.out.println("Contacto agregado correctamente");
        }else{
            System.out.println("No se puede agregar mas contactos. Capacidad maxima alcanzada.");
        }
    }

    private static void buscarContacto(String[] contactos, String[] telefonos) {
        System.out.println("ingrese el nombre del contacto que desea buscar");
        String nombreBuscado = teclado2.next();
        
        boolean encontrado = false;
        for (int i = 0; i < cantidadDeContactos; i++) {
            if(contactos[i].equalsIgnoreCase(nombreBuscado)){
                System.out.println("Nombre:"+ contactos[i]+" "+telefonos[i]);
                encontrado = true;
                break;
            }
        }if (!encontrado){
            System.out.println("No se encontro el Contacto deseado");
        }
    }

}
