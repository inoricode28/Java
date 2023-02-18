/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_12 { 
    static String cadena;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        
        //String cadena;
        System.out.println("Ingrese letra o numero: ");
        cadena = scaner.next();
        
        if (cadena.matches("[0-9]+")){
            //int num = Integer.parseInt(cadena);
            //System.out.println(num+"-"+num*2+"-"+num*3);
            numero();
        }else if ((("a".equals(cadena)||("e".equals(cadena)||("i".equals(cadena))||("o".equals(cadena))||("u".equals(cadena)))))){
            //System.out.println("Murcielago");
            vocales();
        }
        else{
            //System.out.println("Los anexos y documentos adjuntos faltaban indexar y ver alguna huella o pizca de queja");
            consonantes();
        }
        
    }
    
    static void numero(){
        int num = Integer.parseInt(cadena);
        System.out.println(num+"-"+num*2+"-"+num*3);
}
    static void vocales(){
        System.out.println("Murcielago");
    }
    static void consonantes(){
        System.out.println("Los anexos y documentos adjuntos faltaban indexar y ver alguna huella o pizca de queja");
    }
     
    
}
