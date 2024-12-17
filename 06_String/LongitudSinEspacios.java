import java.util.Scanner;

public class LongitudSinEspacios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada del usuario
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        // Eliminar espacios
        String textoSinEspacios = texto.replace(" ", "");

        // Calcular la longitud
        int longitud = textoSinEspacios.length();

        // Mostrar el resultado
        System.out.println(
            "La longitud de la cadena sin contar espacios es: " + longitud
        );

        scanner.close();
    }
}
