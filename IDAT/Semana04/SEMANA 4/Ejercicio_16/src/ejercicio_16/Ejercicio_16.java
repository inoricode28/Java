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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorInicial, valorFinal, sum = 0, product = 1;

        System.out.print("Ingrese el l�mite Inicial: ");
        valorInicial = scanner.nextInt();

        System.out.print("Ingrese el l�mite Final: ");
        valorFinal = scanner.nextInt();

        for (int i = valorInicial; i <= valorFinal; i++) {
          if (i % 2 == 0) {
            sum += i;
          } else {
            product *= i;
          }
        }scanner.close();

        System.out.println("La suma de los n�meros pares es: " + sum);
        System.out.println("La multiplicaci�n de los n�meros impares es: " + product);
        
    }
    
}
