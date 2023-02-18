/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 5; double d = 8.5; char c = 'A';
        String cadena;
        
        Integer x = 18; Double y = 19.7; Character z = 'b';
        
        System.out.println("Datos Primitivos, int: "+1+" double: "+d+" char: "+c);
        System.out.println("Envoltorios, Integer: "+x+" Double: "+y+" Character: "+z);
        System.out.println("int concatenado con double: "+Integer.toString(1)+" - "+Double.toString(d));
        cadena = Integer.toString(i + x);
        i = Integer.parseInt(cadena);
        System.out.println("Suma de Primitivo + envoltorio int : "+i);
        cadena = Double.toString(d+y);
        y = Double.valueOf(cadena);
        
        System.out.println("Suma de Primitivo + envoltorio int: "+y);
        System.out.println("Es digito: "+Character.isDigit(c));
        System.out.println("Es espacio en blanco: "+Character.isWhitespace(z));
        System.out.println("Es mayuscula: "+Character.isUpperCase(c));
        System.out.println("Es minuscula: "+Character.isLowerCase(z));
    }
    
}
