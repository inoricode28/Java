/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_16b;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_16b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        double principal, interes,anios;
        System.out.println("Ingrese el monto de la inversi�n inicial: ");
        principal = scaner.nextDouble();
        System.out.println("Ingrese la tasa de inter�s anual (en porcentaje): ");
        interes = scaner.nextDouble();
        
        anios=1/(Math.log(1+interes/100)/Math.log(2));
        System.out.println("Tomar� " + Math.ceil(anios) + " a�os para duplicar su inversi�n.");
    }
    
}
