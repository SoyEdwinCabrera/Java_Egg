import java.util.Scanner;

public class LongitudCadena {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una cadena de texto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        // Obtener la longitud de la cadena utilizando el método length() dela clase String
        int longitud = texto.length();

        // Mostrar la longitud de la cadena en pantalla
        System.out.println(
            "La longitud de la cadena ingresada es: " + longitud
        );
        scanner.close();
    }
}
