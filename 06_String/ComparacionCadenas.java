import java.util.Scanner;

public class ComparacionCadenas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada del usuario
        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        // Comparar las palabras
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }

        scanner.close();
    }
}
