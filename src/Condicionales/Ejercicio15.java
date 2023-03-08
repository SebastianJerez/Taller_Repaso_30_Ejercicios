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
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int mes = 0;
        int diasMes=0;
        String nombreMes="";
        
        System.out.println("Escriba un numero del 1 al 12");
        do{
            mes=entrada.nextInt();
            if(mes<1||mes>12){
                System.out.println("Numero no valido, intente de nuevo");
            }
        }while(mes<1||mes>12);
        
        switch(mes){
            case 1:{
                diasMes=31;
                nombreMes="Enero";
                break;
            }
            case 2:{
                diasMes=29;
                nombreMes="Febrero";
                break;
            }
            case 3:{
                diasMes=31;
                nombreMes="Marzo";
                break;
            }
            case 4:{
                diasMes=30;
                nombreMes="Abril";
                break;
            }
            case 5:{
                diasMes=31;
                nombreMes="Mayo";
                break;
            }
            case 6:{
                diasMes=30;
                nombreMes="Junio";
                break;
            }
            case 7:{
                diasMes=31;
                nombreMes="Julio";
                break;
            }
            case 8:{
                diasMes=31;
                nombreMes="Agosto";
                break;
            }
            case 9:{
                diasMes=30;
                nombreMes="Septiembre";
                break;
            }
            case 10:{
                diasMes=31;
                nombreMes="Octubre";
                break;
            }
            case 11:{
                diasMes=30;
                nombreMes="Noviembre";
                break;
            }
            case 12:{
                diasMes=31;
                nombreMes="Diciembre";
                break;
            }
        }
        
        System.out.println(nombreMes+" tiene "+diasMes+" dias ");
    }
}
