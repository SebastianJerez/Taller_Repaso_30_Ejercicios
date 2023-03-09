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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuantos numeros primos quiere ver?");
        int numeros = entrada.nextInt();
        int primos=2;
        //Se empieza el bucle para mostrar numeros primos
        // NOTA: se usa mucho la palabra reservada "continue" para pasar a la siguiente repeticion luego de que se muestra el numero primo buscado
        do{
            //Obviamente el 2 es primo asi que lo mostramos
            if(primos==2){
                System.out.print(primos+", ");
                primos++;
                numeros--;
                continue;
            }
            //Si son pares, no son primos, asi que pasamos a la siguiente repeticion
            if(primos%2==0){
                primos++;
                continue;
            }
            if(primos>2){
                boolean esPrimo = true; //Este booleano se usa para saber si el numero es primo, si no es primo, saltamos a la siguiente repeticion
                
                //Aqui se valida de la siguiente forma, empezamos en 3 y vamos aumentando de 2 en 2, usamos el "i*i" cuando se trata de numeros primos grandes dificiles de calcular
                for(int i=3;i*i<=primos;i+=2){
                    if(primos%i==0){
                        primos++;
                        esPrimo=false;
                    }
                }
                if(!esPrimo){
                    continue;
                }
            }
            //Si pasan cada una de las validaciones anteriores, entendemos que el numero si es primo, asi que se muestra en pantalla
            System.out.print(primos+", ");
            numeros--;
            primos++;
        }while(numeros>0);
        System.out.println("");
    }
}
