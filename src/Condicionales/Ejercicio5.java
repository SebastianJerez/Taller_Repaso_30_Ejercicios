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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero base: ");
        double base = entrada.nextDouble();
        System.out.println("Ingrese el exponente del numero:");
        double exponente = entrada.nextDouble();
        
        double resultado;
        if(exponente>0){
            resultado = Math.pow(base,exponente);
            System.out.println("El resultado es: "+resultado);
        }else if(exponente==0){
            System.out.println("El resultado es 1");
        }else if(exponente<0){
            resultado = Math.pow(base,(exponente*(-1)));
            System.out.println("El resultado es: "+(1/resultado));
        }
    }
}
