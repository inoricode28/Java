import java.util.Scanner;

public class Ejer03_MACR {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Ingrese C para cuadrado o R para rectángulo: ");
        char figura = scaner.nextLine().charAt(0);

        switch (figura) {
            case 'C':
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scaner.nextDouble();
                System.out.println(FiguraGeometrica.calcularPerimetro(lado));
                break;
            case 'R':
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scaner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scaner.nextDouble();
                System.out.println(FiguraGeometrica.calcularPerimetro(base, altura));
                break;
            default:
                System.out.println("Opción NO válida.");
                break;
        } scaner.close();
    }
}

class FiguraGeometrica {
    private FiguraGeometrica() {}

    public static String calcularPerimetro(double lado) {
        return "El perímetro del cuadrado es: " + (4 * lado);
    }

    protected static String calcularPerimetro(double base, double altura) {
        return "El perímetro del rectángulo es: " + (2 * (base + altura));
    }
}

