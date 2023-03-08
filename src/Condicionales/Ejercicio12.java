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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tiempoLlamada=1;
        int diaSemana=0;
        String jornada="";
        double recargoLlamada=0;
        double pagoLlamada=0;
        System.out.println("Ingrese el tiempo de duracion de su llamada:");
        do{
            tiempoLlamada = entrada.nextInt();
            if(tiempoLlamada<=0){
                System.out.println("Valor no valido, debe ser mayor a 0 ");
            }
        }while(tiempoLlamada<=0);
        
        System.out.println("Ingrese el dia de la semana (del 1 al 7, donde 1 es Lunes y 7 Domingo):");
        do{
            diaSemana = entrada.nextInt();
            if(diaSemana<1||diaSemana>7){
                System.out.println("Valor no valido, intente de nuevo");
            }
        }while(diaSemana<1||diaSemana>7);
        
        System.out.println("¿En que jornada se realizo la llamada?(M para mañana - T para tarde):");
        do{
            jornada = entrada.next();
            jornada = jornada.toUpperCase();
            if(!jornada.equals("M")&&!jornada.equals("T")){
                System.out.println("Valor no valido, intente de nuevo");
            }
        }while(!jornada.equals("M")&&!jornada.equals("T"));
        
        if(tiempoLlamada<=5){
            pagoLlamada = tiempoLlamada*100;
        }else if(tiempoLlamada<=8){
            pagoLlamada = 5*100;
            pagoLlamada = pagoLlamada + ((tiempoLlamada-5)*80);
        }else if(tiempoLlamada<=10){
            pagoLlamada = 5*100;
            pagoLlamada = pagoLlamada + (3*80);
            pagoLlamada = pagoLlamada + ((tiempoLlamada-8)*70);            
        }else if(tiempoLlamada>10){
            pagoLlamada = 5*100;
            pagoLlamada = pagoLlamada + (3*80);
            pagoLlamada = pagoLlamada + (2*70);
            pagoLlamada = pagoLlamada + ((tiempoLlamada-10)*50);
        }
        
        if(diaSemana==7){
            recargoLlamada=pagoLlamada*0.03;
        }else if(jornada.equals("M")){
            recargoLlamada=pagoLlamada*0.15;
        }else if(jornada.equals("T")){
            recargoLlamada=pagoLlamada*0.1;
        }
        
        int pagoEuros = (int) (pagoLlamada+recargoLlamada);
        double pagoCent = pagoEuros%100;
        pagoEuros = pagoEuros/100;
        
        System.out.print("Gracias por usar nuestro servicio de llamada. El cobro de su llamada tiene un total de "+pagoEuros);
        System.out.printf(" euros con %.0f",pagoCent);
        System.out.printf(" centimos\n");
        
    }
}
