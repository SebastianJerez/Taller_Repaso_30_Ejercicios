/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

/**
 *
 * @author sebas
 */
public class Ejercicio8 {
    public static void main(String[] args) throws InterruptedException {
        int segundos, minutos, horas=0;
        boolean funciona=true;
        do{
            minutos=0;
            do{
                segundos=0;
                do{
                    System.out.printf("%02d : %02d : %02d\n",horas,minutos,segundos);
                    segundos++;
                    Thread.sleep(1000);
                }while(segundos<60);
                minutos++;
            }while(minutos<60);
            horas++;
        }while(horas<60);
    }
}
