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
        
        int año;
        System.out.println("Ingrese el años: ");
        año = in.nextInt();
        if ((año %4 ==0 && año % 100 !=0)|| año % 400 ==0){
            System.out.println("El año es BISIESTO");
        }else{
            System.out.println("El Año no es BISIESTO!!!!");
        }in.close();
        
    }
}
