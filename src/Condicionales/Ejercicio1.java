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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        float num1 = entrada.nextFloat();
        System.out.println("Ingrese otro numero:");
        float num2 = entrada.nextFloat();
        
        if(num1>num2){
            System.out.println("El numero "+num1+" es mayor que "+num2);
        }else if(num2>num1){
            System.out.println("El numero "+num2+" es mayor que "+num1);
        }else{
            System.out.println("Ambos numeros son iguales");
        }
        
    }
}
