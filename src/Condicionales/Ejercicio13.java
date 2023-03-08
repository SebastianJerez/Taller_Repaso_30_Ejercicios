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
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int dado = 0;
        String caraDado="";
        
        System.out.println("Ingrese que numero cayo en el dado");
        do{
            dado = entrada.nextInt();
            if(dado<1||dado>6){
                System.out.println("ERROR: numero incorrecto, intente de nuevo");
            }
        }while(dado<1||dado>6);
        
        switch(dado){
            case 1 -> caraDado="Seis";
            case 2 -> caraDado="Cinco";
            case 3 -> caraDado="Cuatro";
            case 4 -> caraDado="Tres";
            case 5 -> caraDado="Dos";
            case 6 -> caraDado="Uno";
        }
        
        System.out.println("La cara opuesta del dado es el numero "+caraDado);        
    }
}
