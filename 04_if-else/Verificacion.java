import java.util.Scanner;

public class Verificacion {

    public static void main(String[] args) {
        // Contraseña predefinida
        final String CONTRASENA = "12345";

        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la contraseña
        System.out.print("Ingrese la contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        // Validar la contraseña
        if (contrasenaIngresada.equals(CONTRASENA)) {
            // Uso de String.equals() para comparar cadenas, garantizando precisión en la comparación de contraseñas.
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        // Cerrar Scanner
        scanner.close();
    }
}
