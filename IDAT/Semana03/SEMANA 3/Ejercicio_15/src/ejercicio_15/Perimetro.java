/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_15;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Perimetro {
    static int perimetro;
    public void Triangulo(){
        Scanner scaner = new Scanner(System.in);
        int l1, l2, l3;
        System.out.println("Ingrese lado 1: ");
        l1 = scaner.nextInt();
        System.out.println("Ingrese lado 2: ");
        l2 = scaner.nextInt();
        System.out.println("Ingrese lado 3: ");
        l3 = scaner.nextInt();
        
        perimetro = l1+l2+l3;
        System.out.println("El perimetro es: "+perimetro);
    }
    public void Cuadrado(){
        int lado;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese lado: ");
        lado = scaner.nextInt();
        
        perimetro = lado*4;
        System.out.println("El perimetro es: "+perimetro);
    }
    public void Circulo(){
        float radio;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese radio: ");
        radio = scaner.nextFloat();
        
        double a = 2*3.1416*radio;
        System.out.println("El perimetro es: "+a);
    }
}
