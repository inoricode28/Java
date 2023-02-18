/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_11 {
    static int num1, num2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        
        String operacion;
        
        System.out.println("Ingrese primer numero: ");
        num1 = scaner.nextInt();
        System.out.println("Ingrese segundo numero: ");
        num2 = scaner.nextInt();
        System.out.println("Ingrese tipo de operacion[Suma/Resta/Division/Producto]: ");
        operacion = scaner.next();
        
        
        if (operacion.equals("Suma")){
            Suma();
        }else if (operacion.equals("Resta")){
            Resta();
        }else if (operacion.equals("Division")){
            Division();
        }else if (operacion.equals("Producto")){
            Producto();
        }else{
            System.out.println("Ingrese un numero");
        }
       
    }
    
    
    static void Suma(){
        int SUMA = num1 + num2;
        System.out.println("La suma es: "+SUMA);
    }
    static void Resta(){
        int RESTA = num1 - num2;
        System.out.println("La resta es: "+RESTA);
    }
    static void Division(){
        int division = num1 / num2;
        System.out.println("La Division es: "+division);
    }
    static void Producto(){
        int producto = num1 * num2;
        System.out.println("El producto es: "+producto);
    }
    
}
