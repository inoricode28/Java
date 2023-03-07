/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;
import otroPaquete.Fecha6;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Fecha6 fi = new Fecha6();
        // Fecha6 final por teclado
        System.out.print("Ingrese el dia de la fecha final: "); int dia=s.nextInt();
        System.out.print("Ingrese el mes de la fecha final: "); int mes=s.nextInt();
        System.out.print("Ingrese el año de la fecha final: "); int año=s.nextInt();

        Fecha6 ff = new Fecha6(dia,mes,año);
        System.out.println("\nFecha Inicial: "+fi.mostrarFecha());
        System.out.println("Fecha Final: "+ff.mostrarFecha());
    }
}
