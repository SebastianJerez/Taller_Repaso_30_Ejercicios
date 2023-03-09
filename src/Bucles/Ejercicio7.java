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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor a pagar el primer mes:");
        double compra = entrada.nextDouble();
        
        System.out.println("Ingrese el aumento mensual que tendran sus cuotas:");
        double aumento = entrada.nextDouble();
        
        System.out.println("Ingrese el plazo maximo a pagar su compra:");
        int plazo = entrada.nextInt();
        
        double total = 0;
         
        for(int i=1;i<=plazo;i++){
            System.out.print("\nMes "+i+": ");
            System.out.printf("%.2f",compra);
            total+=compra;
            compra*=aumento;
        }
        
        System.out.printf("\n\nEl total a pagar es de %.2f",total);
        System.out.print(" euros\n");
    }
}
