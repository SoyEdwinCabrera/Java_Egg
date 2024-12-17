import java.util.Scanner;

public class AnalisisNumeroAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 30
        System.out.print("Ingresa un número entre 1 y 30: ");
        int numeroLimite = scanner.nextInt();

        // Validar que el número esté entre 1 y 30
        if (numeroLimite < 1 || numeroLimite > 30) {
            System.out.println("Error: El número debe estar entre 1 y 30.");
        } else {
            // Generar un número aleatorio entre 1 y numeroLimite
            int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;

            // Calcular la raíz cuadrada del número aleatorio
            double raizCuadrada = Math.sqrt(numeroAleatorio);

            // Analizar si el número es primo
            boolean esPrimo = esNumeroPrimo(numeroAleatorio);

            // Mostrar resultados
            System.out.println("Número aleatorio generado: " + numeroAleatorio);
            System.out.println("Raíz cuadrada del número: " + raizCuadrada);

            if (esPrimo) {
                System.out.println(
                    "El número " + numeroAleatorio + " es primo."
                );
            } else {
                System.out.println(
                    "El número " + numeroAleatorio + " no es primo."
                );
            }
        }

        scanner.close();
    }

    // Método para determinar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
