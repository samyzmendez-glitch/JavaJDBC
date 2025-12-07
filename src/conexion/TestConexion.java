package Test;

import conexion.Conexion;
import java.sql.Connection;

public class TestConexion {
    public static void main(String[] args) {

        Connection con = Conexion.getConnection();

        if (con != null) {
            System.out.println("🎉 La conexión a MySQL FUNCIONA");
        } else {
            System.out.println("❌ La conexión es NULL");
        }
    }
}
