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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        char letra;
        int ascii;
        do{
            System.out.println("Escriba un caracter");
            letra = entrada.next().charAt(0);
            ascii = (int) letra;
            if(ascii==65||ascii==69||ascii==73||ascii==79||ascii==85||ascii==97||ascii==101||ascii==105||ascii==111||ascii==117){
                System.out.println("VOCAL");
            }else if(ascii==32){
                System.exit(0);
            }else{
                System.out.println("NO VOCAL");
            }
        }while(ascii!=32);
    }
}
