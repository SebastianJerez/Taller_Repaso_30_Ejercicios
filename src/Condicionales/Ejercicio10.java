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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Asociacion de vinicultores 'SweetGrapes'");
        System.out.println("Ingrese cuantos kilos de uva trae:");
        double kiloUva = entrada.nextDouble();
        System.out.println("De que tipo son las uvas? (A - B):");
        String tipo;
        do{
            tipo = entrada.next();
            tipo = tipo.toUpperCase();
            if(!tipo.equals("A")&&!tipo.equals("B")){
                System.out.println("No ingreso un valor valido, intente de nuevo");
            }
        }while(!tipo.equals("A")&&!tipo.equals("B"));
        System.out.println("De que tamaño son las uvas? (1 - 2):");
        int tamanyo=1;
        do{
            tamanyo = entrada.nextInt();
            if(tamanyo!=1&&tamanyo!=2){
                System.out.println("No ingreso un valor valido, intente de nuevo");
            }
        }while(tamanyo!=1&&tamanyo!=2);
        System.out.println("Ingrese el precio que tiene el kilo de uva actualmente(en euros):");
        double precioUva = entrada.nextDouble();
        double sumaCent=0;
        
        if(tipo.equals("A")){
            switch(tamanyo){
                case 1 -> sumaCent = 20;
                case 2 -> sumaCent = 30;
            }
        }else{
            switch(tamanyo){
                case 1 -> sumaCent = -30;
                case 2 -> sumaCent = -50;
            }
        }
        
        double totalCent = kiloUva * sumaCent;
        int sumaEuros = (int) (totalCent/100);
        totalCent = totalCent%100;
        double totalEuros = (precioUva * kiloUva) + sumaEuros;
        if(totalCent<0){
            totalEuros--;
            totalCent = 100+totalCent;
        }
        
        System.out.println("Los resultados son los siguientes:\n");
        System.out.println("Total de kilos de uva comercializados: "+kiloUva+" kg");
        System.out.println("Tipo de uva: "+tipo);
        System.out.println("Tamaño de uva: "+tamanyo);
        System.out.println("Recargo monetario por clasificacion de uva (tipo y tamaño): "+sumaCent+" centimos por kilo");
        System.out.println("Precio actual del kilo de uva: "+precioUva+" euros");
        System.out.printf("\nTotal de la venta: %.0f",totalEuros);
        System.out.printf(" euros con %.0f",Math.abs(totalCent));
        System.out.printf(" centimos\n");
        
    }
}
