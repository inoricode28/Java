/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author Jeferson
 */
public class claseSaludar {
    public void saludarPublico(){
        System.out.println("Hola publico (otra clase)");
    }
    private void saludarPrivado(){
        System.out.println("Hola privado (otra clase)");
    }
    protected void saludarProtegido(){
        System.out.println("Hola protegido (otra clase)");
    }
    void saludarPredeterminado(){
        System.out.println("Hola predeterminado (otra clase)");
    }
    public void otroSaludo(){
        saludarPrivado();
    }
}
