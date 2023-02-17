/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_17;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        String palabra;
        System.out.println("Ingrese una palabra: ");
        palabra = scaner.next();
        
        int n1 = palabra.length();
        
        
        
        for (int i = 0; i < n1; i++) {
            System.out.println(palabra.charAt(i));
        }
    }
    
}
