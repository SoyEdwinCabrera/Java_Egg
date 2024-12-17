import java.util.Scanner;

public class ReemplazarCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada del usuario
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingresa el carácter a reemplazar: ");
        char charARemplazar = scanner.next().charAt(0);

        System.out.print("Ingresa el nuevo carácter: ");
        char charNuevo = scanner.next().charAt(0);

        // Reemplazar caracteres
        String fraseModificada = frase.replace(charARemplazar, charNuevo);

        // Mostrar el resultado
        System.out.println("Frase modificada: " + fraseModificada);

        scanner.close();
    }
}
