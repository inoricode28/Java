import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre ="";

        do{
            System.out.println("Ingrese su nombre: ");
            nombre = scanner.nextLine();
        }while(nombre.isBlank());
        System.out.println("Hola " + nombre);
        scanner.close();    

        
    }
}
