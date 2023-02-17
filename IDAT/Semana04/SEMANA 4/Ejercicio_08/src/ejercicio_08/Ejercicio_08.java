/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_08;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acumulado = 1;
        int factorial = 10;
        for (int i = factorial; i > 0 ; i--)
            acumulado = acumulado*i;
        
        System.out.println("La factorial del numero "+factorial+" es: "+acumulado);
    }
    
}
