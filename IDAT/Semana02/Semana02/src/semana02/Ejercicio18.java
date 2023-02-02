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
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int angulo1, angulo2, angulo3;
        int sumAngulos;

        System.out.print("Ingresa el primer ángulo: ");
        angulo1 = entrada.nextInt();
        System.out.print("Ingresa el segundo ángulo: ");
        angulo2 = entrada.nextInt();
        System.out.print("Ingresa el tercer ángulo: ");
        angulo3 = entrada.nextInt();

        sumAngulos = angulo1 + angulo2 + angulo3;

        if (sumAngulos != 180) {
            System.out.println("No es un triángulo válido, la suma de sus ángulos debe ser 180°");
        } else {
            if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
                System.out.println("Es un triángulo acutángulo");
            } else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                System.out.println("Es un triángulo rectángulo");
            } else {
                System.out.println("Es un triángulo obtuso");
            }
        }
        entrada.close();
    }
}
