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
public class Ejercicio09 {
    public static void main(String[] args) {
        char letra;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la inicial de una letra: ");
        letra = scanner.next().toUpperCase().charAt(0);
                
       switch(letra){
           case 'V':
               System.out.println("La estacion es Verano");
               break;
            case 'P':
               System.out.println("La estacion es Primavera");
               break;
            case 'I':
               System.out.println("La estacion es Invierno");
               break;
            case 'O':
               System.out.println("La estacion es Otoño");
               break;
            default:
                System.out.println("NO es una estacion");
                break;
       }
       scanner.close();
    }
}
