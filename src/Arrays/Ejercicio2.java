/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese 10 numeros:");
        int [] numeros = new int [10];
        
        for(int i=0;i<10;i++){
            System.out.println((i+1)+":");
            numeros[i] = entrada.nextInt();
        }
        
        int max = numeros[0];
        int min = numeros[0];
        
        for(int i=1;i<10;i++){
            if(numeros[i]>max){
                max = numeros[i];
            }
            if(numeros[i]<min){
                min = numeros[i];
            }
        }
        System.out.println("Esta es la lista de numeros: \n");
        for(int i=0; i<10;i++){
            System.out.print(numeros[i]+" ");
            if(numeros[i]==max){
                System.out.print("Maximo");
            }
            if(numeros[i]==min){
                System.out.print("Minimo");
            }
            System.out.println(" ");
        }
    }
}
