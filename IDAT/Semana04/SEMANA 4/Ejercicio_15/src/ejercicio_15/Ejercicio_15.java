/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_15;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        double principal, interes;
        double montoTotal, interesAnual;
        double anios = 1;
        
        do {
        System.out.println("Ingrese el monto de la inversión inicial: ");
        principal = scaner.nextDouble();
        System.out.println("Ingrese la tasa de interés anual (en porcentaje): ");
        interes = scaner.nextDouble();
        } while (principal <= 0 || interes <= 0);
        
        int i = 0;
        do {
            i++;
            interesAnual = principal * interes / 100 * anios;
            montoTotal = principal + interesAnual;
            if (montoTotal > principal*2) {
                System.out.println(anios);
                System.out.println(montoTotal);
        break;   
            }else
            {
                System.out.println(montoTotal+ " " + interesAnual);
                anios +=1;
            }  
        } while (true);
        
        //System.out.println(anios);
    }
}
