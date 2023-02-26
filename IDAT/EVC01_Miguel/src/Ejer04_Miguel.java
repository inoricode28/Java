import java.util.Scanner;
public class Ejer04_Miguel {
    static String cadena1;
    static String cadena2;
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Ingrese la primera cadena: ");
        cadena1 = scaner.nextLine();
        
        System.out.print("Ingrese la segunda cadena: ");
        cadena2 = scaner.nextLine();
        
        Validaciones validacion = new Validaciones();
        boolean resultado = validacion.contiene(cadena1, cadena2);
        
        if (resultado) {
            System.out.println("La cadena 1 contiene a la cadena 2.");
        } else {
            resultado = validacion.contiene(cadena2, cadena1);
            if (resultado) {
                System.out.println("La cadena 2 contiene a la cadena 1.");
            } else {
                System.out.println("Las cadenas son totalmente diferentes.");
            }scaner.close();
        }
    }
}  

class Validaciones {
    boolean contiene(String cadena1, String cadena2) {
        return cadena1.contains(cadena2);
    }
}
