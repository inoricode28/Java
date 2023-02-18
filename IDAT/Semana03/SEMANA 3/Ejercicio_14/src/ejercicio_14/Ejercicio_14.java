/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_14 {
    static String cadena;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese una forma geometrica[Triangulo/Cuadrado/Circulo]: ");
        cadena = scaner.next();
        
        Formas f = new Formas();
        
        if (cadena.equals("Triangulo")){
            f.Triangulo();
        }else if (cadena.equals("Cuadrado")){
            f.Cuadrado();
        }else if (cadena.equals("Circulo")){
            f.Circulo();
        }else{
            System.out.println("Ingrese una de las alternativas");
        }
    }
    
}
