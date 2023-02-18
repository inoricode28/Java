/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Metodos de la misma clase
        saludarPrivado();
        saludarPublico();
        saludarProtegido();
        saludarPredeterminado();
        System.out.println("-----------------------------");
        //Metodos de otra clase 
        claseSaludar cS = new claseSaludar();
        cS.saludarPublico();
        cS.saludarProtegido();
        cS.saludarPredeterminado();
        cS.otroSaludo();
    }
    
    private static void saludarPrivado(){
        System.out.println("Hola Privado (misma clase)");
    }
    public static void saludarPublico(){
        System.out.println("Hola Publico (misma clase)");
    }
    protected static void saludarProtegido(){
        System.out.println("Hola protegido (misma clase)");
    }
    static void saludarPredeterminado(){
        System.out.println("Hola predeterminado (misma clase)");
    }
    
}
