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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                
        int Numero1,Numero2;
        
                
        System.out.println("Dame el primer número");
        Numero1 = scanner.nextInt();
        
        System.out.println("Dame el Segundo número");
        Numero2 = scanner.nextInt();
        
        if (Numero1>Numero2){
           System.out.println(Numero1 + " es mayor que " + Numero2);
        }
        else{
           System.out.println(Numero2 + " es mayor que " + Numero1);
            } scanner.close();       
    }
}

