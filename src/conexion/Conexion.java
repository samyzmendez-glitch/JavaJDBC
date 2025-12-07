package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/login_db";
    private static final String USER = "root";
    private static final String PASS = "Samy12345"; 

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return con;
    }
}
