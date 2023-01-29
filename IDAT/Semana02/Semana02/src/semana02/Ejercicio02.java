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
public class Ejercicio02 {
    public static void main(String[] args) {
        
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valor 1: ");
        a = scanner.nextInt();
        System.out.println("Ingrese valor 2: ");
        b = scanner.nextInt();
                
        boolean condicion = true;
        System.out.println("a==b : "+ (a == b));
        System.out.println("a<b : "+ (a < b));
        System.out.println("a<=b : "+(a <= b));
        System.out.println("a>=b : "+(a >= b));
        System.out.println("a!=b : "+(a != b));
        System.out.println("Condicion==true: "+(condicion == true));
        
    }
}
