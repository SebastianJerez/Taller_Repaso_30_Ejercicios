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
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Que numero de dia de la semana es hoy? (1-7)");
        int dia=0;
        
        do{
            dia = entrada.nextInt();
            if(dia<1||dia>7){
                System.out.println("Ese numero no tiene sentido, que dia es hoy? (1-7)");
            }
        }while(dia<1||dia>7);
        String diaSemana="";
        
        switch(dia){
            case 1 -> diaSemana="Lunes";
            case 2 -> diaSemana="Martes";
            case 3 -> diaSemana="Miercoles";
            case 4 -> diaSemana="Jueves";
            case 5 -> diaSemana="Viernes";
            case 6 -> diaSemana="Sabado";
            case 7 -> diaSemana="Domingo";
        }
        
        System.out.println("Cierto!, hoy es "+diaSemana);
    }
}
