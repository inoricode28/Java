/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;
import java.util.Scanner;
import otroPaquete.Fecha7;
/**
 *
 * @author LENOVO
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Fecha7 fi=new Fecha7();
                
        System.out.println("Ingrese la Fecha Final con el siguiente formato: DD/MM/AAAA");
        System.out.print("Dia: "); int dia=s.nextInt();
        System.out.print("Mes: "); int mes=s.nextInt();
        System.out.print("Año: "); int año=s.nextInt();
        Fecha7 ff=new Fecha7(dia,mes,año);
        System.out.println("Fecha Inicial: "+fi.mostrarFecha());
        System.out.println("Fecha Final: "+ff.mostrarFecha()); 
        
    }
}
