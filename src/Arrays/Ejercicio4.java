/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int [][] numeros = new int [4][5];
        int [] sumaFilas = new int [4];
        int [] sumaColumnas = new int [5];
        int [][] newNumeros = new int [5][6];
        int total = 0;
        
        System.out.println("Matriz de numeros");
        
        for(int i=0;i<4;i++){
            sumaFilas[i] = 0;
            for(int j=0;j<5;j++){
                numeros[i][j] = (int) (Math.random()*900+100);
                sumaFilas[i] += numeros[i][j];
            }
        }
        for(int j=0;j<5;j++){
            sumaColumnas[j]=0;
            for(int i=0;i<4;i++){
                sumaColumnas[j]+=numeros[i][j];
            }
            total += sumaColumnas[j];
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                if(i==4&&j==5){
                    continue;
                }
                if(i==4){
                    newNumeros[i][j]=sumaColumnas[j];
                    continue;
                }
                if(j==5){
                    newNumeros[i][j]=sumaFilas[i];
                    continue;
                }
                newNumeros[i][j]=numeros[i][j];
            }
        }
        newNumeros[4][5]=total;
        
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                System.out.print(newNumeros[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
