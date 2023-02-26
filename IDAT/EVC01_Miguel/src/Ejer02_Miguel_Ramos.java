import java.util.Scanner;

public class Ejer02_Miguel_Ramos {
    static private double faren;
    static private double gradosFH;
    public static void main(String[] args) {
    Scanner scaner = new Scanner(System.in);
    
    float cel=0;
    System.out.println("Ingrese la temperatura en grados Cel: ");
    cel = scaner.nextFloat();
    Ejer02_Miguel_Ramos temp = new Ejer02_Miguel_Ramos();
    faren = temp.convert(cel);
    System.out.println("Su equivalente en farenheit es: " + Math.floor(faren));
    scaner.close();
    }

    public double convert(float cel) {
        gradosFH = (cel * 1.8)+32;
        return gradosFH;
    }
}
