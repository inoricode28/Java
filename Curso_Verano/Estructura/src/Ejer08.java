public class Ejer08 {
    public static void main(String[] args) {
        
        int numero_uno= 6, numero_dos = 3, resultado = 0;
        int parametro = 4;
        switch(parametro){

            case 1: resultado = numero_uno + numero_dos; 
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
            case 2: resultado = numero_uno - numero_dos; 
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
            case 3: resultado = numero_uno * numero_dos; 
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
            case 4: resultado = numero_uno / numero_dos; 
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
            default: System.out.println("Error, la opción no existe");
                    break;
        }
    }
}
