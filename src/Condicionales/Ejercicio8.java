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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los 3 lados de un triangulo:");
        System.out.println("A:");
        int a=entrada.nextInt();
        System.out.println("B:");
        int b=entrada.nextInt();
        System.out.println("C:");
        int c=entrada.nextInt();
        
        double hipotenusa;
        double cateto1;
        double cateto2;
        if(a>b&&a>c){
            hipotenusa=Math.pow(a,2);
            cateto1=Math.pow(b,2);
            cateto2=Math.pow(c,2);
        }else if(b>c){
            hipotenusa=Math.pow(b,2);
            cateto1=Math.pow(a,2);
            cateto2=Math.pow(c,2);
        }else{
            hipotenusa=Math.pow(c,2);
            cateto1=Math.pow(a,2);
            cateto2=Math.pow(b,2);
        }
        
        if(a==b&&a==c){
            System.out.println("El triangulo es un triangulo equilatero");
        }else if(a==b||a==c||b==c){
            System.out.println("El triangulo es un triangulo isoceles");
        }else if(hipotenusa==cateto1+cateto2){
            System.out.println("El triangulo es un triangulo rectangulo");
        }else{
            System.out.println("El trinagulo es un triangulo escaleno");
        }
        
    }
}
