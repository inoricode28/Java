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
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c;
        System.out.println("Ingrese una vocal");
        c = in.next().charAt(0);
        switch(c){
                case'a':
                case'e':
                case'i':
                case'o':
                case'u':
                case'A':
                case'E':
                case'I':
                case'O':
                case'U':
                    System.out.println(c+" Es una vocal");
                    break;
                default:
                    System.out.println(c+" Es un Consonante");
                    
    }in.close();
 }
}
