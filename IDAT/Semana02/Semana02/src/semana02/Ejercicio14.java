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
public class Ejercicio14 {
    public static void main(String[] args) {
        int dia;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del dia: ");
        dia = scanner.nextInt();
                
       switch(dia){
           case 1:
               System.out.println("El dia "+dia+" es Lunes");
               break;
           case 2:
               System.out.println("El dia "+dia+" es Martes");
               break;
           case 3:
               System.out.println("El dia "+dia+" es Miercoles");
               break;
            case 4:
               System.out.println("El dia "+dia+" es Jueves");
               break;
            case 5:
               System.out.println("El dia "+dia+" es Viernes");
               break;
            case 6:
               System.out.println("El dia "+dia+" es Sabado");
               break;
            case 7:
               System.out.println("El dia "+dia+" es Domingo");
               break;
            
            default:
                System.out.println("No es numero de dia");
            
           
       }
       scanner.close();
    }
}
