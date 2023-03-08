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
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido a su servicio de entrega de paquetes");
        System.out.println("Ingrese el peso de paquete (gr):");
        float pesoPaq = entrada.nextFloat();
        
        if(pesoPaq>5000){
            System.out.println("Lo sentimos, el peso maximo por paquete es de 5kg, este programa se cerrará.");
            System.exit(0);
        }
        
        System.out.println("¿A que destino desea enviar su paquete?");
        System.out.println("1. America del Norte");
        System.out.println("2. America Central");
        System.out.println("3. America del Sur");
        System.out.println("4. Europa");
        System.out.println("5. Asia");
        System.out.println("Seleccione su opcion:");
        int opcion;
        do{
            opcion = entrada.nextInt();
            if(opcion<1||opcion>5){
                System.out.println("Opcion no valida, intente de nuevo");
            }
        }while(opcion<1||opcion>5);
        int precioEnvio=0;
        
        switch(opcion){
            case 1 -> precioEnvio = 24;
            case 2 -> precioEnvio = 20;
            case 3 -> precioEnvio = 21;
            case 4 -> precioEnvio = 10;
            case 5 -> precioEnvio = 18;
        }
        
        double totalEnvio = precioEnvio * (pesoPaq/1000);
        
        System.out.printf("El valor a pagar por el envio de su paquete es de %.2f",totalEnvio);
        System.out.print(" euros\n");
    }
}
