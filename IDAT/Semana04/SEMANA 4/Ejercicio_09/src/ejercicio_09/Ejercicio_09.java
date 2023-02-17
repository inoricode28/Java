/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_09;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i < 40; i++)
            if (i % 2 == 0)
                contador+=i;
        
        System.out.println("La suma de los 20 primeros numeros pares es: "+contador);
    }//380
    
}
