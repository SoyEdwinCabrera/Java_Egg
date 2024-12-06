import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Declarar y asignar valores a las variables
        int num1 = 10, num2 = 5;

        // Calcular y mostrar los resultados de las operaciones básicas
        realizarOperacionesBasicas(num1, num2);

        // Pedir al usuario que ingrese dos números y mostrar la suma
        procesarEntradaUsuario();
    }

    // Método para realizar operaciones básicas
    private static void realizarOperacionesBasicas(int num1, int num2) {
        System.out.println(
            "Operaciones básicas con números: " + num1 + " y " + num2
        );
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));
    }

    // Método para procesar la entrada del usuario
    private static void procesarEntradaUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Por favor ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println(
            "La suma de los números ingresados es: " + (numero1 + numero2)
        );
        scanner.close();
    }
}
