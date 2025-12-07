package modelo;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // CREATE
    public boolean agregar(Usuario u) {
        String sql = "INSERT INTO usuarios(username, password) VALUES (?, ?)";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error al agregar usuario: " + e.getMessage());
            return false;
        }
    }

    // READ (listar)
    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                lista.add(u);
            }

        } catch (Exception e) {
            System.out.println("Error al listar usuarios: " + e.getMessage());
        }
        return lista;
    }

    // UPDATE
    public boolean actualizar(Usuario u) {
        String sql = "UPDATE usuarios SET username=?, password=? WHERE id=?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ps.setInt(3, u.getId());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error al actualizar usuario: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean eliminar(int id) {
        String sql = "DELETE FROM usuarios WHERE id=?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            return false;
        }
    }
}

