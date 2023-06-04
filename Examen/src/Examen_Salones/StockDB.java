package Examen_Salones;

import java.sql.Connection;
import java.sql.DriverManager;

public class StockDB {

    Connection con;

    public Connection getConnection() {
        String url = "jdbc:mysql://192.168.1.175:3306/Stock";
        String user = "Arch_Nova";
        String pss = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pss);
        } catch (Exception e) {
            System.err.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
        return con;
    }

}
