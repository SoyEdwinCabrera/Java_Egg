import java.util.Scanner;

public class TablasMultiplicar {

    public static void main(String[] args) {
        // Llamar al método para la tabla de multiplicar de un solo número
        int numero = pedirNumeros(1)[0]; // Pedimos un solo número
        imprimirTablaMultiplicar(numero);

        // Llamar al método para la tabla de multiplicar de tres números
        int[] numeros = pedirNumeros(3); // Pedimos tres números
        imprimirTablasMultiplicar(numeros);
    }

    // Método para pedir un número específico de enteros al usuario
    public static int[] pedirNumeros(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    // Método para imprimir la tabla de multiplicar de un número
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println(); // Línea en blanco para separar las tablas
    }

    // Método para imprimir la tabla de multiplicar de cada número
    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            imprimirTablaMultiplicar(numero); // Reutiliza el método para imprimir la tabla
        }
    }
}
