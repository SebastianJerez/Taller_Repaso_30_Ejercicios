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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese otro numero:");
        int num2 = entrada.nextInt();
        
        int mayor, menor;
        
        if(num1>num2){
            mayor=num1;
            menor=num2;
        }else{
            mayor=num2;
            menor=num1;
        }
        
        System.out.print("\nTodos los numeros pares comprendidos entre "+menor+" y "+mayor+" son: ");
        for(int i=menor;i<=mayor;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
    }
}
