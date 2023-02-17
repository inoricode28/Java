/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla = 7;
        int contador = 1;
        for (int i=0 ; i < 10; i ++){
            contador = tabla * i;
            System.out.println(i+" x "+ tabla + " = "+contador);
        }
    }
    
}
