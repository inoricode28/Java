/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_13 {
    static int num1, num2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros que sean multiplos");
        System.out.println("Ingrese primer numero: ");
        num1 = scaner.nextInt();
        System.out.println("Ingrese segundo numero: ");
        num2 = scaner.nextInt();
        
        multiplo();
    }
    
    static void multiplo(){
        int resto = num1%num2;
        if (resto==0){
            System.out.println("Eres muy inteligente");
        }else{
            System.out.println("Debes practicar");
        }
    }
}
