import java.util.Scanner;

public class ConcatCadenas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese su nombre y apellido por separado

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();
        // Concatenar el nombre y el apellido utilizando el método concat()
        String nombreCompleto = nombre.concat(" ").concat(apellido);
        // Mostrar el nombre completo en pantalla
        System.out.println("Tu nombre completo es: " + nombreCompleto);
        scanner.close();
    }
}
