import java.util.Scanner;

public class Ejer01_Miguel_Chavez {
    private static boolean esDivisiblePorTres(int numero) {
        return numero % 3 == 0;
      }
    
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        boolean esDivisible = esDivisiblePorTres(numero);
        if (esDivisible) {
          System.out.println("El número " + numero + " es divisible entre 3.");
        } else {
          System.out.println("El número " + numero + " NO es divisible entre 3.");
        }scanner.close();
      }
}
