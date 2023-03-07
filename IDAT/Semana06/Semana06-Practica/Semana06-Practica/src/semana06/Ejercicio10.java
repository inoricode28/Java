/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;
import otroPaquete.Bombero;
/**
 *
 * @author LENOVO
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Bombero b1 = new Bombero("Jose","Gomez Aguilar",9,false,false);
        Bombero b2 = new Bombero("Juan","Cristobal Perez",25,false, true);
        Bombero b3 = new Bombero("Abél","Valera Vazquez",32,true,true);
        Bombero b4 = new Bombero("Manuel","Vega Sosa",50,true,true,330.0);
        Bombero b5 = new Bombero("Jose","Suarez Muñoz",19,false,false,120.0);
        
        b1.asignarBono();
        b2.asignarBono();
        b3.asignarBono();
        
        b1.mostrarData();
        b2.mostrarData();
        b3.mostrarData();
        b4.mostrarData();
        b5.mostrarData();
    }
}
