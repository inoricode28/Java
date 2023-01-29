import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        x = scanner.nextDouble();

        System.out.print("Ingrese el valor de y: ");
        y = scanner.nextDouble();

        z = Math.sqrt(x * x + y * y);
        System.out.println("El valor de z es: " + z);
        scanner.close();

    }
}
