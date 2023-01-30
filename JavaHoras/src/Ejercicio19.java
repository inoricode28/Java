public class Ejercicio19 {
    public static void main(String[] args) {
        String[][] carro ={
            {"Camaro","Convertte","Silverado"},
            {"Mustang","Ranger","F-150"},
            {"Ferrari","Lambo","Tesla"}
        };
        for(int i=0;i<carro.length;i++){
            System.out.println();
            for(int j=0;j<carro[i].length;j++){
                System.out.print(carro[i][j]+" ");
            }
        }
    }
}
