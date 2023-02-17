/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_24;



public class Ejercicio_24 {

    public static void main(String[] args) {
        int Ana = 2;
        int Bernardo = 4;
        int Carlos = 6;
        
        for (int i = 1; i <= 31; i++) {
            if (i % Ana == 0 && i % Bernardo ==0 && i % Carlos == 0) {
                System.out.println("El dia "+i+" se volveran a juntar");
            }
            
        }
    }
 }
   

