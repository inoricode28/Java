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
public class Ejercicio07 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese valor 1: ");
        a = scanner.nextInt();
        System.out.println("Ingrese valor 2: ");
        b = scanner.nextInt();       
       if (a>b){
           System.out.println(a + " es mayor que " + b);
       } else if(a==b){
           System.out.println(a + " es igual a " + b);
       }else{
           System.out.println(a + " No es mayor que " + b);
       }
       scanner.close();
    }
}
