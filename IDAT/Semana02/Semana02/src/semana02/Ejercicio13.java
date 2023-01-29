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
public class Ejercicio13 {
    public static void main(String[] args) {
        int a, b, suma, resta, multiplicacion, division;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese valor 1: ");
        a = scanner.nextInt();
        System.out.println("Ingrese valor 2: ");
        b = scanner.nextInt();
        //Calcular
        suma = a +b;
        resta = a-b;
        multiplicacion = a*b;
        
        
        System.out.println("La suma es: " +suma);
        System.out.println("La  Resta es: " +resta);
        System.out.println("La Multiplicacion es: " +multiplicacion);
                
       if (a>=b){
           division = a/b;
           System.out.println("La Division es: " +division);
       } else{
           System.out.println("No es divisible");
       }
       scanner.close();
    }
}
