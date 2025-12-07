package login;

import java.util.Scanner;
import modelo.LoginDAO;

public class LoginApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginDAO dao = new LoginDAO();

        System.out.print("Usuario: ");
        String user = sc.nextLine();

        System.out.print("Contraseña: ");
        String pass = sc.nextLine();

        if (dao.validarUsuario(user, pass)) {
            System.out.println("Inicio de sesión exitoso!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
