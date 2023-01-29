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
public class Ejercicio16 {
    public static void main(String[] args) {
        int Base, Altura, Lado,opcion; 
        double pi = 3.1416, Radio, Area;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("OPcion1 --> Triangulo");
        System.out.println("OPcion2 --> Cuadrado");
        System.out.println("OPcion3 --> Circulo");
        System.out.println("==============================");
        
        System.out.println("Ingrese Opcion a Realizar");
        opcion = scanner.nextInt();
        
        switch(opcion){
           case 1:
               System.out.println("Ingrese, Base de Triangulo: ");
               Base = scanner.nextInt();
               System.out.println("Ingrese, Altura de Triangulo: ");
               Altura = scanner.nextInt();
               Area = Base * Altura;
               System.out.println("El Area del triangulo es: "+Area);
               break;
           case 2:
               System.out.println("Ingrese, Lado del cuadrado: ");
               Lado = scanner.nextInt();
               Area = Lado*Lado;
               System.out.println("El Area del cuadrado es: "+Area);
               break;
            case 3:
               System.out.println("Ingrese, Radio del circulo: ");
               Radio = scanner.nextInt();
               Area = 2*pi*Radio;
               System.out.println("El Area del Circulo es: "+Area);
               break;
               
        }scanner.close();
    }
}
