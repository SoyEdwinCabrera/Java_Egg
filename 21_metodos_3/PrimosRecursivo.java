import java.util.Scanner;

public class PrimosRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (esPrimo(numero)) {
                    System.out.println(numero + " es un número primo.");
                } else {
                    System.out.println(numero + " no es un número primo. Intenta de nuevo.");
                }
            }
        } while (numero != 0);

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    // Método que verifica si un número es primo utilizando recursividad
    public static boolean esPrimo(int numero) {
        // Un número menor o igual a 1 no es primo
        if (numero <= 1) {
            return false;
        }
        // Llamada recursiva para verificar si es primo
        return esPrimoRecursivo(numero, 2);
    }

    // Método recursivo que verifica si el número es primo
    private static boolean esPrimoRecursivo(int numero, int divisor) {
        // Si el divisor es mayor que la raíz cuadrada del número, es primo
        if (divisor * divisor > numero) {
            return true;
        }
        // Si el número es divisible por el divisor, no es primo
        if (numero % divisor == 0) {
            return false;
        }
        // Llamada recursiva incrementando el divisor
        return esPrimoRecursivo(numero, divisor + 1);
    }
}






