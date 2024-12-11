import java.util.Scanner;

public class Adultes {

    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad del usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Determinar categoría de edad
        // Estructura condicional escalonada con límites claros para cada categoría de edad, garantizando que solo un mensaje sea mostrado.
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad <= 64) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }

        // Cerrar Scanner
        scanner.close();
    }
}
