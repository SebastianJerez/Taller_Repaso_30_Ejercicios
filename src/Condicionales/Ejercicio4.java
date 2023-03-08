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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una letra:");
        String letra = entrada.next();
        
        if(letra.length()>1){
            System.out.println("Ingresaste una palabra no una letra");
        }else if(letra.equals(letra.toUpperCase())){
            System.out.println("Ingresaste una letra mayuscula");
        }else{
            System.out.println("Ingresaste una letra minuscula");
        }
    }
}
