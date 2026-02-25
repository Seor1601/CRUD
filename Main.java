import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Leer Usuarios");
            System.out.println("3. Actualizar Usuario");
            System.out.println("4. Eliminar Usuario");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    Crud.crearUsuario(new Usuario(id, nombre, email));
                    System.out.println("Usuario creado.");
                    break;

                case 2:
                    List<Usuario> lista = Crud.leerUsuarios();
                    for (Usuario u : lista) {
                        System.out.println(u);
                    }
                    break;

                case 3:
                    System.out.print("ID a actualizar: ");
                    int idAct = sc.nextInt(); sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nuevo email: ");
                    String nuevoEmail = sc.nextLine();
                    Crud.actualizarUsuario(idAct, nuevoNombre, nuevoEmail);
                    System.out.println("Usuario actualizado.");
                    break;

                case 4:
                    System.out.print("ID a eliminar: ");
                    int idElim = sc.nextInt(); sc.nextLine();
                    Crud.eliminarUsuario(idElim);
                    System.out.println("Usuario eliminado.");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}