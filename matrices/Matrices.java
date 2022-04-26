//package proyecto_matrices;
import java.util.Scanner;
public class Matrices{
    private int filas;
    private int columnas;
    private int[][] m;
    private int[] diagonalPrincipal;
    private int[] diagonalSecundaria;

    public void poblar_matriz(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        filas = obj.nextInt();
        System.out.print("Ingrse el # de columnas: ");
        columnas = obj.nextInt();

        m = new int[filas][columnas];
        for(int i=0; i<m.length;i++){
            for(int j=0; j<m[i].length;j++){
                System.out.print("Ingrese m["+i+"]["+j+"]: ");
                m[i][j]=obj.nextInt();
            }
        }

    }

    public void poblar_diagonales(){
        diagonalPrincipal = new int[filas];
        diagonalSecundaria = new int[filas];
        for(int i=0; i<m.length;i++){
            for(int j=0; j<m[i].length;j++){
                if(i==j){
                    diagonalPrincipal[i]=m[i][j];
                }
                if(i+j == m.length-1){
                    diagonalSecundaria[i]=m[i][j];
                }
            }
        }

    }

    public void mostrar_arreglo(int[] vector){
        for(int i=0; i<vector.length;i++){
            System.out.println("Elemento["+i+"]: "+vector[i]);
        }
    }

    public void mostrar_matriz(int[][] matriz){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length;j++){
                System.out.println("Matriz["+i+"]["+j+"]: "+matriz[i][j]);
            }
        }
    }

    public int devuelve_mayor(){
        int mayor =m[0][0];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(m[i][j]>mayor){
                    mayor = m[i][j];
                }

            }
        }
        return mayor;
    }

    public void imprimir(){
        System.out.println("\nElementos de la Matriz");
        mostrar_matriz(m);
        if(filas==columnas){
            poblar_diagonales();
            System.out.println("\nElementos de la diagonal principal");
            mostrar_arreglo(diagonalPrincipal);
            System.out.println("\nElementos de la diagonal secundaria");
            mostrar_arreglo(diagonalSecundaria);            
        }
        System.out.println("\nEl mayor elemnto en la matriz es: "+devuelve_mayor());
    }

}