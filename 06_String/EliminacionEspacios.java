import java.util.Scanner;

public class EliminacionEspacios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada del usuario
        System.out.print(
            "Ingresa una frase con espacios al inicio y/o al final: "
        );
        String frase = scanner.nextLine();

        System.out.println(frase.length());

        // Eliminar espacios en blanco
        String fraseSinEspacios = frase.trim();

        // Mostrar el resultado
        System.out.println(
            "Frase sin espacios al inicio o al final: '" +
            fraseSinEspacios +
            "'"
        );
        System.out.println(fraseSinEspacios.length());

        scanner.close();
    }
}
