/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero base:");
        double base = entrada.nextDouble();
        System.out.println("Ingrese un numero exponente:");
        int exp = entrada.nextInt();
        double resultado=1;
        
        for(int i=0;i<exp;i++){
            resultado=resultado*base;
        }
        
        System.out.println("El resultado de esa potencia es: "+resultado);
    }
}
