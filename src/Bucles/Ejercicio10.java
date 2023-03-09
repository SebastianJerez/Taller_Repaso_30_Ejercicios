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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de filas que tendra la piramide:");
        int filas = entrada.nextInt();
        
        for(int i=1;i<=filas;i++){
            for(int j=1;j<=filas-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=filas-(filas-i);j++){
                System.out.print(j);
            }
            for(int j=(filas-1)-(filas-i);j>=1;j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
