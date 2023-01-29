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
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lado_a, lado_b, lado_c;
        System.out.print("Ingresa el valor de lado a: ");
        lado_a = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de lado b: ");
        lado_b = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de lado c: ");
        lado_c = in.nextDouble();
        in.nextLine();
        if(lado_a==lado_b&&lado_a==lado_c)
            System.out.println("Equil\u00E1tero");
        if((lado_a==lado_b&&lado_a!=lado_c)||(lado_a==lado_c&&lado_a!=lado_b)||(lado_b==lado_c&&lado_b!=lado_a))
            System.out.println("Is\u00F3sceles");
        if(lado_a!=lado_b&&lado_a!=lado_c&&lado_b!=lado_c)
            System.out.println("Escaleno");
                
                
                
    }
}
