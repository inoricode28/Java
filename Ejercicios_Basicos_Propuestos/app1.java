import java.util.Scanner;
public class app1
{
    private String nombre;
    private double radio;
    private int n;
    public void ingreso(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = obj.nextLine();
        System.out.print("Ingrese el radio: ");
        radio = obj.nextDouble();
        System.out.print("Ingrese un valor entero: ");
        n = obj.nextInt();

    }
    public void saludo(){
        System.out.print("Hola "+nombre+"!!!\n");

    }
    public void longitud_circunferencia(){
        double lc = 2*Math.PI*radio;
        System.out.print("Longitud de la circunferencia: "+lc+"\n");
    }
    public void cuadrado(){
        double c = Math.pow(n,2);
        System.out.print("El cuadrado es: "+c);
    }
   
}