/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author ericka
 */
public class Ejer04 {
    public static void main(String[] args) {
        //Variables
        double base,altura,area,per�metro;
        Scanner scaner = new Scanner (System.in);
        
        //Enunciantes
        System.out.println("Ingrese la base: ");
        base = scaner.nextFloat();
        System.out.println("Ingrese la altura: ");
        altura = scaner.nextFloat();
        
        //Calculo
        area=base*altura;
        per�metro=(base+altura)/2;
        
        //Salientes
        System.out.println("El �rea es: " + area);
        System.out.println("El per�metro es: " + per�metro);
        scaner.close();
    }
}
