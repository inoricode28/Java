/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_23;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_23 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " Es divisible de 3");
            }
            else if (i % 5 == 0 && i % 5 != 5) {
                System.out.print(i+ " Es divisible de 5");
            }
            else{
                continue ;
            }
            
            System.out.println("");
        }
    }
    
}
