/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_18;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_18 {

    
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0; 
        
        
        System.out.println("Ingrese un valor inicial: ");
        n1 = scaner.nextInt();
        System.out.println("Ingrese valor maximo: ");
        n2 = scaner.nextInt();
        
        for (int i = n1; i < n2; i++) {
            if (i % 3 == 0) {
                continue ;
            }
            else if (i % 7 == 0) {
                break;
            }System.out.println(i);
        
        }
        
    }
    
}
