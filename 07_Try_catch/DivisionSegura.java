import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que ingrese dos números enteros
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();
        // Realizar la división segura y manejar la excepción
        try {
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción en caso de división por cero
            System.out.println("Error: No es posible dividir por cero.");
        }
        // Cerrar el scanner
        scanner.close();
    }
}
