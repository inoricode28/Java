import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Hola "+nombre);
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        JOptionPane.showMessageDialog(null, "Tu edad es: "+edad);

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura"));
        JOptionPane.showMessageDialog(null, "Tu altura es: "+altura+"cm");
        

    }
}
