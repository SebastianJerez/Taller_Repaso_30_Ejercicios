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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int adivinar = (int) (Math.random()*100+1);
        int numEscrito=0;
        System.out.println("Adivina el numero magico");
        System.out.println("Escribe un numero del 1 al 100, a ver si logras adivinar el numero magico. Tienes 10 intentos!");
        
        for(int i=10;i>0;i--){
            numEscrito = entrada.nextInt();
            
            if(numEscrito==adivinar){
                System.out.println("Felicidades!! Adivinaste el numero!!!");
                System.out.println("Lo lograste en "+(10-i)+" intentos!");
                break;
            }else if(i-1==0){
                System.out.println("Oh! que mal, no lograste adivinar, el numero magico era "+adivinar);
                break;
            }else if(numEscrito>adivinar){
                System.out.println("Ups, el numero que buscas es menor, intenta de nuevo!");
            }else if(numEscrito<adivinar){
                System.out.println("Ups, el numero que buscas es mayor, intenta de nuevo!");
            }
        }
    }
}
