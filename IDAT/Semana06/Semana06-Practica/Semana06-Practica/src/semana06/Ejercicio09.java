/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;
import java.util.Scanner;
import otroPaquete.Taxi;
/**
 *
 * @author LENOVO
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Ingrese la placa del taxi: "); String pl=s.nextLine();
        System.out.print("Ingrese el nombre y apellido del conductor: "); String c=s.nextLine();
        Taxi t= new Taxi(pl,c);
        t.mostrarData();
        t.activarPermisos();
        //Realizando un par de servicios
        t.realizarSerivicio(4.50);
        t.realizarSerivicio(2.50);
        t.realizarSerivicio(1.00);
        t.realizarSerivicio(7.50);
        t.mostrarData();
        
        t.desactivarPermisos();
        t.realizarSerivicio(2.00);
        t.mostrarData();
    }
}
