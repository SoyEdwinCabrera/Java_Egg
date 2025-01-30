import java.util.Scanner;

public class CrearArrayAleatorio {

    public static void main(String[] args) {
        Scanner superscanner = new Scanner(System.in);

        // Solicitar el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = superscanner.nextInt();

        // Solicitar el rango de números posibles
        System.out.print("Ingrese el valor mínimo del rango: ");
        int min = superscanner.nextInt();
        System.out.print("Ingrese el valor máximo del rango: ");
        int max = superscanner.nextInt();

        // Validar que el rango sea correcto
        if (min >= max) {
            System.out.println(
                "El valor mínimo debe ser menor que el valor máximo."
            );
            return;
        }

        // Crear el array y llenarlo con números aleatorios
        int[] arrayAleatorio = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arrayAleatorio[i] = numeroAleatorio(min, max);
        }

        // Imprimir el array generado
        System.out.println("Array generado: ");
        for (int num : arrayAleatorio) {
            System.out.print(num + " ");
        }

        superscanner.close();
    }

    // Método que genera un número aleatorio entre min y max
    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
/*
Explicación del código:

Método main:
    Se crea un objeto Scanner para leer la entrada del usuario.
    Se solicita al usuario que ingrese el tamaño del arreglo.
    Se solicita el valor mínimo y máximo del rango para los números aleatorios.
    Se valida que el valor mínimo sea menor que el valor máximo. Si no es así,
    se muestra un mensaje de error y se termina la ejecución.
    Se crea un arreglo de enteros del tamaño especificado y se llena con números aleatorios
    generados mediante el método numeroAleatorio(min, max).
    Finalmente, se imprime el arreglo generado en la consola.

Método numeroAleatorio(int min, int max):
    Este método utiliza Math.random() para generar un número aleatorio en el rango especificado, asegurando que el número esté entre min y max, incluyendo ambos extremos.
    Este código permite al usuario generar un arreglo de números aleatorios de un tamaño y rango especificados, y luego imprime el arreglo resultante.
*/
