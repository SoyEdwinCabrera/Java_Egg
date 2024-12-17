import java.util.Scanner;

public class ConversionCadenaTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
            "Ingresa una cadena que represente un número entero: "
        );

        String cadena = scanner.nextLine();
        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println(
                "Error: La cadena ingresada no puede ser convertida a un número entero."
            );
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}
