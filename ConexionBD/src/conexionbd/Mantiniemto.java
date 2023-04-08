package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Mantiniemto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila?"
                    + "user=root&password=admin");
            stmt = conn.createStatement();
            //Creacion de ña tabla medoante este comando
            stmt.executeUpdate("CREATE TABLE PRODUCTOS "
                    + "(ID INT NOT NULL, "
                    + "NOMBRE VARCHAR(20), "
                    + "PRECIO DECIMAL(7,2), "
                    + " PRIMARY KEY (ID))");
            System.out.println("Tabla creada correctamente");

            while (opcion != 5) {
                System.out.println("======= MENU =======");
                System.out.println("1. Crear producto");
                System.out.println("2. Leer productos");
                System.out.println("3. Actualizar producto");
                System.out.println("4. Eliminar producto");
                System.out.println("5. Salir");
                System.out.print("Ingrese la opcion deseada: ");
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        System.out.println("Bye Bye...!!!");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }

            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendedorError" + ex.getErrorCode());

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.getMessage());
                }
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.getMessage());
                }
                stmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.getMessage());
                }
                conn = null;
            }

        }

    }

}
