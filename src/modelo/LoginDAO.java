package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexion.Conexion;

public class LoginDAO {

    public boolean validarUsuario(String username, String password) {
        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (Exception e) {
            System.out.println("Error al validar usuario: " + e.getMessage());
        }

        return false;
    }
}
