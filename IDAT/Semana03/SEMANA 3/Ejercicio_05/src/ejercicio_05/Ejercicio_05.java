/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_05;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_05 {
    static int base = 10, altura = 5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularArea();
    }
    static void calcularArea(){
        int area = base * altura /2;
        System.out.println("El area del triangulo es: "+area);
    }
    
}
