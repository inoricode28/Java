/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sentencia FOR");
        //sentencia for
        for (int i = 9; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("---------------------------------------------");
        
        System.out.println("Sentencia WHILE");
        //sentencia while
        int j = 9;
        while(j > 0){
            System.out.println(j);
            j--;
        }
        System.out.println("---------------------------------------------");
        
        System.out.println("Sentencia DO WHILE");
        int z = 9;
        do {
            System.out.println(z);
            z--;
        } while (z > 0);
    }
    
}
