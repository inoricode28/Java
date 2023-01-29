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
public class Ejercicio08 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        a = scanner.nextInt();
                
       if ((a>=1)&&(a<=9)){
           System.out.println(a + " esta entre 1 y 9 ");
       } else if((a>=10)&&(a<=19)){
           System.out.println(a + " esta entre 10 y 19 ");
       }else if((a>=20)&&(a<=29)){
           System.out.println(a + " esta entre 20 y 29 ");
       }else{
           System.out.println(a + " NO esta entre 1 y 29 ");
       }
       scanner.close();
    }
}
