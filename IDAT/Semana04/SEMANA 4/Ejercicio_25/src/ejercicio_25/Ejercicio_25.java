/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_25;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_25 {

    public static void main(String[] args) {
       int numero = 0;
       
       Scanner scaner = new Scanner(System.in);
       
       System.out.println("Ingrese numero: ");
       numero = scaner.nextInt();
       
       StringBuilder cadena = new StringBuilder();

       while (numero > 0) {
           int binario = numero % 2;
           cadena.append(binario);
           numero /= 2;
        }
       
       cadena = cadena.reverse();
       
       System.out.println("En binario es: "+cadena.toString());
    }
    
}
