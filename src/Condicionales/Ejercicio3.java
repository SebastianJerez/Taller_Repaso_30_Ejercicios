/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el dividendo:");
        double num1 = entrada.nextDouble();
        System.out.println("Ingrese el divisor:");
        double num2 = entrada.nextDouble();
        
        if(num2==0){
            System.out.println("Error: no se permite la division entre 0");
        }else{
            double total = num1/num2;
            System.out.printf("El resultado de la division es: %.3f\n",total);
        }
    }
}
