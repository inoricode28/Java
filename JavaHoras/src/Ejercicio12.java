import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tu estas jugando un juego! Presiona q o Q para salir");
        String respuesta = scanner.next();

        if (!respuesta.equals("q") && !respuesta.equals("Q")) {
            System.out.println("Todavía estás jugando el juego *pew pew*");
           
        }
        else{
            System.out.println("Saliste del Juego");
        }
        scanner.close();

    }
}
