/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
class Formas {
    static int area;
    public void Triangulo(){
        Scanner scaner = new Scanner(System.in);
        int base, altura;
        System.out.println("Ingrese base: ");
        base = scaner.nextInt();
        System.out.println("Ingrese altura: ");
        altura = scaner.nextInt();
        
        area = base * altura/2;
        System.out.println("El area es: "+area);
    }
    public void Cuadrado(){
        int lado;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese lado: ");
        lado = scaner.nextInt();
        
        area = lado*lado;
        System.out.println("El area es: "+area);
    }
    public void Circulo(){
        float radio;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese radio: ");
        radio = scaner.nextFloat();
        
        double a = 3.1416 * radio * radio;
        System.out.println("El area es: "+a);
    }
   
}
