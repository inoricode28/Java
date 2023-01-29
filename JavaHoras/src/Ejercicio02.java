import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        String nombre, comida;
        //Enunciante
        System.out.println("Cual es tu nombre?");
        nombre = scanner.nextLine();

        System.out.println("Cual es tu edad?");
        edad = scanner.nextInt();
        scanner.nextLine();//Salto de linea
        
        System.out.println("Cual es tu comida favorita?");
        comida = scanner.nextLine();
        
        //Saliente
        System.out.println("Hola " + nombre + ", tu edad es " + edad + " y tu comida favorita es " + comida);        
        scanner.close();
    }

}
