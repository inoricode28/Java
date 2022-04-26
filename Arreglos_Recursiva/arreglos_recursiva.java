//Miguel Alfonzo Chavez Ramos
import java.util.Scanner;
public class arreglos_recursiva
{
    private int[] numeros_pares;
    private int[] numero_cuadrado;   
    private int n;
    

    public arreglos_recursiva(){
        Scanner obj = new Scanner(System.in);
        do{
            System.out.print("Ingrese n: ");
            n = obj.nextInt();
        }
        while(n<=0);
        numeros_pares = new int[n];
        numero_cuadrado = new int[n];
    }


    public void poblar_arreglo(){
        for(int i=1; i<=n; i++){
            numeros_pares[i-1]=i*2;
                   
        }
    }
    public int potencia_recursiva(int b, int n){
        if (n==0){
            return 1;
        }
        else{  //n!=0
            return b*potencia_recursiva(b,n-1);
        }
  }

    public void potencia_arreglo(){//Potencia Usando recursivas
        for(int i=1; i<=n; i++){
            numero_cuadrado[i-1]=potencia_recursiva(2*i, 2);
                   
        }
    }

   
    public void imprimir_pares_usando_arreglos(){
        //potencia_arreglo();
        poblar_arreglo();       
        System.out.print("\nMostrar los numeros pares (usando arreglos)\n");
        for(int i=0; i<numeros_pares.length; i++){
            System.out.print(numeros_pares[i]+"  ");        
        
        }
        System.out.print("");      

    }

    public void imprimir_potencia_usando_arreglos(){
        potencia_arreglo();
        System.out.print("\nMostrar los numeros pares (usando arreglos)\n");
        for(int i=0; i<numero_cuadrado.length; i++){
            System.out.print(numero_cuadrado[i]+"  ");        
        
        }
        System.out.print("");

    }

    
    
}