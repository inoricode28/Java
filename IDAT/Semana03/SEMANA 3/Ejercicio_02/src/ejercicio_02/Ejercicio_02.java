/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = ingresarNombre();
        System.out.println("Hola "+ nombre);
    }
    static String ingresarNombre(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        return scaner.next();
    }
    
}
