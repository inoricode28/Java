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
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a�o;
        System.out.println("Ingrese el a�os: ");
        a�o = in.nextInt();
        if ((a�o %4 ==0 && a�o % 100 !=0)|| a�o % 400 ==0){
            System.out.println("El a�o es BISIESTO");
        }else{
            System.out.println("El A�o no es BISIESTO!!!!");
        }in.close();
        
    }
}
