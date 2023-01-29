/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

import java.util.Scanner;

/**
 *
 * @author Nova
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        char letra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la inicial de una letra: ");
        letra = scanner.next().charAt(0);        
        

        if (Character.isUpperCase(letra)) //utilizamos el método isUpperCase de la clase Character        
        {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        } 
    }
}
