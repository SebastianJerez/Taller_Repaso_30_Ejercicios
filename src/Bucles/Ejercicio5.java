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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int superior = 0;
        int inferior = 0;
        int valores = 0;
        double suma = 0;
        int fuera = 0;
        int igual = 0;
        
        do{
            System.out.println("Ingrese el limite inferior del intervalo:");
            inferior = entrada.nextInt();
            System.out.println("Ingrese el limite superior del intervalo:");
            superior = entrada.nextInt();
            
            if(inferior>superior){
                System.out.println("El limite inferior es mayor que el superior, ingreselos de nuevo.");
            }
        }while(inferior>superior);
        
        do{
            System.out.println("Digite un numero:");
            valores = entrada.nextInt();
            
            if(valores==0){
                break;
            }
            if(valores>inferior&&valores<superior){
                suma+=valores;
            }
            if(valores<inferior||valores>superior){
                fuera++;
            }
            if(valores==inferior||valores==superior){
                igual++;
            }
        }while(valores!=0);
        
        System.out.print("La suma de los numeros ingresados comprendidos en el intervalo abierto ("+inferior+","+superior+") es: ");
        System.out.printf("%.2f",suma);
        System.out.println("\nSe ingresaron "+fuera+" numeros comprendidos fuera del intervalo");
        System.out.println("Se ingresaron "+igual+" numeros iguales a los intervalos");
    }
}
