/*{
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese 10 numeros:");
        int [] numeros = new int [10];
        
        for(int i=0;i<10;i++){
            System.out.println((i+1)+":");
            numeros[i] = entrada.nextInt();
        }
        
        for(int i=10;i>0;i--){
            System.out.print(numeros[i-1]+",");
        }
    }
}
