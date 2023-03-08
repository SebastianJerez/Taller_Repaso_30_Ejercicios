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
public class Ejercicio7 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los puntos centrales y el radio de la primera circunferencia:");
        System.out.println("X1:");
        int x1=entrada.nextInt();
        System.out.println("Y1:");
        int y1=entrada.nextInt();
        System.out.println("Radio1:");
        int r1;
        do{
            r1=entrada.nextInt();
            if(r1==0){
                System.out.println("Ingresaste un radio 0, el radio no puede ser 0.");
            }
        }while(r1==0);
        if(r1<0){
            System.out.println("Ingresaste un radio negativo, se tomara el valor absoluto de ese numero como radio");
            r1=Math.abs(r1);
        }
        
        System.out.println("Ingrese los puntos centrales y el radio de la segunda circunferencia:");
        System.out.println("X2:");
        int x2=entrada.nextInt();
        System.out.println("Y2:");
        int y2=entrada.nextInt();
        System.out.println("Radio2:");
        int r2;
        do{
            r2=entrada.nextInt();
            if(r2==0){
                System.out.println("Ingresaste un radio 0, el radio no puede ser 0.");
            }
        }while(r2==0);
        if(r2<0){
            System.out.println("Ingresaste un radio negativo, se tomara el valor absoluto de ese numero como radio");
            r2=Math.abs(r2);
        }
        
        double distancia = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
        
        if(distancia>(r1+r2)){
            System.out.println("Las circunferencias son "+ANSI_CYAN_BACKGROUND+ANSI_RED+"Exteriores"+ANSI_RESET);
        }else if(distancia==(r1+r2)){
            System.out.println("Las circunferencias son "+ANSI_CYAN_BACKGROUND+ANSI_RED+"Tangentes exteriores"+ANSI_RESET);
        }else if(distancia<(r1+r2)&&distancia>Math.abs(r1-r2)){
            System.out.println("Las circunferencias son "+ANSI_CYAN_BACKGROUND+ANSI_RED+"Secantes"+ANSI_RESET);
        }else if(distancia>0&&distancia<Math.abs(r1-r2)){
            System.out.println("Las circunferencias son "+ANSI_CYAN_BACKGROUND+ANSI_RED+"Interiores"+ANSI_RESET);
        }else if(distancia==Math.abs(r1-r2)){
            System.out.println("Las circunferencias son "+ANSI_CYAN_BACKGROUND+ANSI_RED+"Tangentes interiores"+ANSI_RESET);
        }else if(distancia==0){
            System.out.println("Las circunferencias son "+ANSI_CYAN_BACKGROUND+ANSI_RED+"Concentricas"+ANSI_RESET);
        }
    }
}
