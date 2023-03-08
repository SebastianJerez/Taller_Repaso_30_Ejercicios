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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numAlumnos=0;
        double precioBus=0;
        double precioxAlumno=0;
        
        System.out.println("¿Cuantos alumnos iran en el viaje?:");
        do{
            numAlumnos = entrada.nextInt();
            if(numAlumnos<=0){
                System.out.println("Valor no válido");
            }
        }while(numAlumnos<=0);
        
        if(numAlumnos<30){
            precioBus=4000;
            precioxAlumno=precioBus/numAlumnos;
        }else if(numAlumnos<50){
            precioxAlumno=95;
            precioBus=precioxAlumno*numAlumnos;
        }else if(numAlumnos<100){
            precioxAlumno=70;
            precioBus=precioxAlumno*numAlumnos;
        }else if(numAlumnos>=100){
            precioxAlumno=65;
            precioBus=precioxAlumno*numAlumnos;
        }
        
        System.out.printf("Se deben pagar %.0f",precioBus);
        System.out.printf(" euros a la compañia de transforte.");
        System.out.printf("\nCada alumno debe pagar %.2f\n",precioxAlumno);
    }
}
