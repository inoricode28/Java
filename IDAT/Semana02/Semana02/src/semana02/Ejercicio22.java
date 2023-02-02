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
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tipo de s�ndwich (A, B, C, D): ");

        char tipo = entrada.next().charAt(0);
        double costo = 0.0;
        double servicios = 0, propinas = 0, total = 0;

        switch (tipo) {
            case 'A':
                costo = 4.5;
                break;
            case 'B':
                costo = 5.0;
                break;
            case 'C':
                costo = 7.5;
                break;
            case 'D':
                costo = 13.5;
                break;
            default:
                System.out.println("Tipo de s�ndwich inv�lido");
                System.exit(0);
        }

        servicios = costo * 0.05;
        propinas = costo * 0.02;
        total = costo + servicios + propinas;

        System.out.println("Costo: S/. " + costo);
        System.out.println("Servicios (5%): S/. " + servicios);
        System.out.println("Propinas (2%): S/. " + propinas);
        System.out.println("Total: S/. " + total);
        entrada.close();
    }
}
