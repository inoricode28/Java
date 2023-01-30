import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows,columns;
        String Symbol = "";

        System.out.println("Ingrese la cantidad de filas:");
        rows = scanner.nextInt();

        System.out.println("Ingrese la cantidad de columnas:");
        columns = scanner.nextInt();
        System.out.println("Ingrese el symbol:");
        Symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(Symbol);
            }          
        }
        scanner.close();

    }
}
