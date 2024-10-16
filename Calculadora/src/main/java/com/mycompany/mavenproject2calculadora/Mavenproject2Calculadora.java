/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2calculadora;

import java.util.Scanner;

/**
 *
 * @author juane
 */
public class Mavenproject2Calculadora {

    public static void main(String[] args) {
        int opciones;
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");

        do {
            System.out.println("Opciones de la calculadora:" +
                    "\n1. Suma" +
                    "\n2. Resta" +
                    "\n3. Multiplicacion" +
                    "\n4. Division" +
                    "\nElige una opcion: ");
                if(scanner.hasNextInt()){
                    opciones = scanner.nextInt();
                    System.out.println("Ingresar un numero: ");
                    if(scanner.hasNextInt()){
                        calculadora.setNumeroUno(scanner.nextInt());
                    }else{
                        break;
                    }
                    System.out.println("Ingresa otro numero: ");
                    if (scanner.hasNextInt()){
                        calculadora.setNumeroDos(scanner.nextInt());
                    }else{
                        break;
                    }

                    switch (opciones){
                        case 1: {
                            System.out.println(calculadora.sumar());
                            break;
                        }
                        case 2: {
                            System.out.println(calculadora.resta());
                            break;
                        }
                        case 3: {
                            System.out.println(calculadora.multiplicacion());
                            break;
                        }
                        case 4: {
                            System.out.println(calculadora.dividiv());
                            break;
                        }
                    }
                }else{
                    opciones = 0;
                }


                System.out.println("Si deseas salir de la calculadora ingresa Cero");

                if(scanner.hasNextInt())
                    opciones = scanner.nextInt();

        }while (opciones != 0);
    }
}
