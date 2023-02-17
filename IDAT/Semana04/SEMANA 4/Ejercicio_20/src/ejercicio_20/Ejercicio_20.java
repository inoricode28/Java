/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_20;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_20 {

    public static void main(String[] args) {
        int suma = 1;
        int resta = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+i-suma);  
            }
            suma +=1;
            System.out.println();
        }
        
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
}
