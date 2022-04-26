import java.util.Scanner;
public class iteracion
{
    private int[] numeros;
    private int n;
    public iteracion(){
        Scanner obj = new Scanner(System.in);
        do{
            System.out.print("Ingrese n: ");
            n = obj.nextInt();
        }
        while(n<=0);
        numeros = new int[n];
    }

    public void poblar_arreglo(){
        for(int i=1; i<=n; i++){
            numeros[i-1]=i;
        }
    }
    public void imprimir_sin_usar_arreglos(){
        System.out.print("Mostrar los "+n+" numeros naturales sin usar arreglos");
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.print("");       
        
    }

    public void imprimir_usando_arreglos(){
        poblar_arreglo();
        System.out.print("Mostrar los "+n+" primeros numeros naturales(usando arreglos)");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+"  ");            
        }
        System.out.print("");
    }
    
}