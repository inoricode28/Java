/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_26;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_26 {
    static int num1 = 0;
    static int num2 = 0;
    static int seguir = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        
        int num = 0;
        //System.out.println("OPERACIONES ARITMETICAS");
        //System.out.println("-----------------------");
        //System.out.println("1. SUMAR\n2. RESTAR\n3. MULTIPLICAR\n4. DIVIDIR");
        ///System.out.println("Ingrese numero de la operacion a realizar: ");
        //num = scaner.nextInt();
        
        do{
            System.out.println("OPERACIONES ARITMETICAS");
            System.out.println("-----------------------");
            System.out.println("1. SUMAR\n2. RESTAR\n3. MULTIPLICAR\n4. DIVIDIR");
            System.out.println("Ingrese numero de la operacion a realizar: ");
            num = scaner.nextInt();
            
            switch (num){
                case 1:
                    System.out.println("Ingrese primero valor: ");
                    num1 = scaner.nextInt();
                    System.out.println("Ingrese segundo valor: ");
                    num2 = scaner.nextInt();
                    System.out.println("------------SUMA-----------");
                    System.out.println("La suma es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Ingrese primero valor: ");
                    num1 = scaner.nextInt();
                    System.out.println("Ingrese segundo valor: ");
                    num2 = scaner.nextInt();
                    System.out.println("------------RESTA-----------");
                    System.out.println("La resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Ingrese primero valor: ");
                    num1 = scaner.nextInt();
                    System.out.println("Ingrese segundo valor: ");
                    num2 = scaner.nextInt();
                    System.out.println("------------MULTIPLICACION-----------");
                    System.out.println("La division es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Ingrese primero valor: ");
                    num1 = scaner.nextInt();
                    while(num1<=0){
                        System.out.println("INGRESE VALOR MAYOR A 0");
                        System.out.println("Ingrese primero valor: ");
                        num1 = scaner.nextInt();
                    }
                    System.out.println("Ingrese segundo valor: ");
                    num2 = scaner.nextInt();
                    System.out.println("------------DIVISION-----------");
                    System.out.println("La division es: "+(num1/num2));
                    break;
                default:
                    System.out.println("NO EXISTE OPERACION [1, 2, 3, 4]");
            }
            System.out.println("\nDESEA REPETIR OTRA OPERACION?");
            System.out.println("1-PARA REPETIR");
            System.out.println("0-PARA SALIR");
            seguir = scaner.nextInt();
       }while(seguir == 1);
    }
    
}
