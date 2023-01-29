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
public class Ejercicio04 {
    public static void main(String[] args) {
        int a, b, c ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valor 1: ");
        a = scanner.nextInt();
        System.out.println("Ingrese valor 2: ");
        b = scanner.nextInt();
        System.out.println("Ingrese valor 3: ");
        c = scanner.nextInt();
        
        System.out.println("El resultado de (a>b) && (b<c) es: "+((a>b)&&(b<c)));
        System.out.println("El resultado de ((a+b)<c)||((a-c)>b) es: " + (((a+b)<c)||((a-c)>b)));
        System.out.println("El resultado de (a+c)>b ||!((a+b)==c) es: "+(((a+b)>b)||!((a+b)==c)));
    }
}
