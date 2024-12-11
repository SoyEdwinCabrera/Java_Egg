import java.util.Scanner;

public class Divisibles {

    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Determinar divisibilidad
        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("El número es divisible por 5 y por 3.");
        } else if (numero % 5 == 0 || numero % 3 == 0) {
            System.out.println(
                "El número es divisible por " +
                (numero % 5 == 0 ? "5" : "3") +
                "."
            );
        } else {
            System.out.println("El número no es divisible ni por 5 ni por 3.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
