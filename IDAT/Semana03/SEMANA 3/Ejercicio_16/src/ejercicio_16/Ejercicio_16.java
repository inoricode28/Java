/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_16;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_16 {
    static String correo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese correo electronico: ");
        correo = scaner.next();
        
        
        usuario();
        
    }
    static void usuario(){
        //int longitud = correo.length();
        //int pos = correo.indexOf("@");
        //String regex = "/\\w/";
        //String rr = correo.substring(0, pos);
        //if (correo.contains("@")&&(correo.substring(0,3).matches("[a-z]*"))){
          // System.out.println("vas bien");
        //}
        if (correo.contains("@")&&(correo.matches("[a-z]+"))){
           System.out.println("vas bien ");
        }
        
    }
    
}
