import java.util.Scanner;

public class MayusculasMinusculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String input = scanner.nextLine();
        // Convertir todos los caracteres a mayúsculas y mostrar
        String mayusculas = input.toUpperCase();
        System.out.println("En mayúsculas: " + mayusculas);
        // Convertir todos los caracteres a minúsculas y mostrar
        String minusculas = input.toLowerCase();

        System.out.println("En minúsculas:" + minusculas);
        scanner.close();
    }
}
