package test;

import modelo.Usuario;
import modelo.UsuarioDAO;

public class TestCRUD {
    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();

        // --- CREATE ---
        Usuario nuevo = new Usuario(0, "nuevoUser", "abc123");
        dao.agregar(nuevo);

        // --- READ ---
        System.out.println("LISTA DE USUARIOS:");
        for (Usuario u : dao.listar()) {
            System.out.println(u);
        }

        // --- UPDATE ---
        Usuario edit = new Usuario(1, "admin_modificado", "9876");
        dao.actualizar(edit);

        // --- DELETE ---
        dao.eliminar(2);

        // LISTAR NUEVAMENTE
        System.out.println("\nDESPUÉS DE CAMBIOS:");
        for (Usuario u : dao.listar()) {
            System.out.println(u);
        }
    }
}

