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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su calificacion (de 1 a 5):");
        int nota = entrada.nextInt();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su genero (M para hombre - F para Mujer):");
        String sexo;
        do{
            sexo = entrada.next();
            sexo = sexo.toUpperCase();
            if(!sexo.equals("M")&&!sexo.equals("F")){
                System.out.println("Ingrese un valor valido");
            }
        }while(!sexo.equals("M")&&!sexo.equals("F"));
        
        if(nota==5 && edad>=18 && sexo.equals("M")){
            System.out.println("Usted tiene una posible aceptacion a su solicitud, por favor, espere nuestra llamada");
        }else if(nota==5 && edad>=18 && sexo.equals("F")){
            System.out.println("Su solicitud a sido aceptada, por favor, espere nuestra llamada");
        }else{
            System.out.println("Su solicitud no ha sido aceptada, ofrecemos disculpas");
        }
    }
}
