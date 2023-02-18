/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_06;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularArea(5, 10);
    }
    static void calcularArea(int base, int altura){
        int area = base * altura / 2;
        System.out.println("El area del triangulo es: "+area);
    }
    
}
