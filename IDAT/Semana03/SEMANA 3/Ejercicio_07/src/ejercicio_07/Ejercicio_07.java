/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_07;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_07 {
    int base = 10, altura = 20;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int baseTri = 8, alturaTri = 4;
        Ejercicio_07 tri = new Ejercicio_07();
        tri.calcularArea(5,10);
        tri.calcularArea(baseTri, alturaTri);
        tri.calcularArea(tri.base, tri.altura);
    }
    
    public void calcularArea(int base, int altura){
        int area = base * altura /2;
        System.out.println("El area del triangulo es: "+area);
    }
    
}
