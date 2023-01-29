/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

import java.util.Scanner;

/**
 *
 * @author Nova
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int mes;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del mes: ");
        mes = scanner.nextInt();
                
       switch(mes){
           case 1:
               System.out.println("El mes"+mes+" es Enero");
               break;
           case 2:
               System.out.println("El mes"+mes+" es Ferbrero");
               break;
           case 3:
               System.out.println("El mes"+mes+" es Marzo");
               break;
            case 4:
               System.out.println("El mes"+mes+" es Abril");
               break;
            case 5:
               System.out.println("El mes"+mes+" es Mayo");
               break;
            case 6:
               System.out.println("El mes"+mes+" es Junio");
               break;
            case 7:
               System.out.println("El mes"+mes+" es Julio");
               break;
            case 8:
               System.out.println("El mes"+mes+" es Agosto");
               break;
            case 9:
               System.out.println("El mes"+mes+" es Septiembre");
               break;
            case 10:
               System.out.println("El mes"+mes+" es Octubre");
               break;
            case 11:
               System.out.println("El mes"+mes+" es Noviembre");
               break;
            case 12:
               System.out.println("El mes"+mes+" es DIciembre");
               break;
            default:
                System.out.println("No es numero de mes");
            
           
       }
       scanner.close();
    }
}
