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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int repeticion=0;
        int negativos=0, positivos=0, cero=0;
        
        System.out.println("Ingrese la cantidad de numeros que quiere ingresar:");
        repeticion=entrada.nextInt();
        
        for(int i=0;i<repeticion;i++){
            System.out.println("Digite un numero:");
            int num = entrada.nextInt();
            
            if(num<0){
                negativos++;
            }else if(num==0){
                cero++;
            }else if(num>0){
                positivos++;
            }
        }
        System.out.println("Se ingresaron "+negativos+" numeros negativos. "+positivos+" numeros positivos y "+cero+" numeros iguales a 0");
    }
}
