import java.util.Scanner;

public class VerificaciondeEdad {

    public static void main(String[] args) {
        final int ANIO_ACTUAL = 2024; // Declaración de constante para el año actual
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario su año de nacimiento
        int anioNacimiento = solicitarNumero(
            scanner,
            "Por favor ingresa tu año de nacimiento: "
        );

        // Calcular la edad
        int calculoEdad = calcularEdad(ANIO_ACTUAL, anioNacimiento);

        // Verificar si es mayor de edad
        verificarMayorDeEdad(calculoEdad);

        // Cerrar el Scanner
        scanner.close();
    }

    // Método para solicitar un número al usuario
    private static int solicitarNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    // Método para calcular la edad
    private static int calcularEdad(int anioActual, int anioNacimiento) {
        return anioActual - anioNacimiento;
    }

    // Método para verificar si el usuario es mayor de edad
    private static void verificarMayorDeEdad(int edad) {
        String mensaje = (edad >= 18)
            ? "Eres mayor de edad."
            : "No eres mayor de edad.";
        System.out.println("Tienes " + edad + " años. " + mensaje);
    }
}
