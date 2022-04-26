public class promedio{
    public static void main(String args[]){
        int matematicas =5;
        int biologia = 8;
        int quiemica =7;
        int promedio = 0;
        promedio =(matematicas+biologia+quiemica)/3;
        if (promedio >=6) {
            System.out.println("El alumno aprobo " + promedio);
        }else{
            System.out.println("El alumno reprobo " + promedio);
        }
        
    }
}