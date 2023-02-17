/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0;
        int contador = 1;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = scaner.nextInt();
        
        for (int i = 0; i < 10; i++) {
            contador = num1 * i;
            System.out.println(i+" x "+num1+" = "+contador);
        }
        
    }
    
}
