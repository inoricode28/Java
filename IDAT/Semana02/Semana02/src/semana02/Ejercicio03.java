/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

/**
 *
 * @author Nova
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 10;
        System.out.println("El resultado de (a>b) && (b<c) es: "+((a>b)&&(b<c)));
        System.out.println("El resultado de ((a+b)<c)||((a-c)>b) es: " + (((a+b)<c)||((a-c)>b)));
        System.out.println("El resultado de (a+c)>b ||!((a+b)==c) es: "+(((a+b)>b)||!((a+b)==c)));
    }
}
