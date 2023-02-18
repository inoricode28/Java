/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_04;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        metodoEstatico();
        ClasePadre CP = new ClasePadre();
        CP.metodoFinal();
    }
    static void metodoEstatico(){
        System.out.println("Metodo Estatico");
    }
}

class ClasePadre{
    final void metodoFinal(){
        System.out.println("Metodo Final");
    }
}
