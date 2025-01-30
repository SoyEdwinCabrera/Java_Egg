import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el rango para el número aleatorio
        int min = 1;
        int max = 20;

        // Generar un número aleatorio en el rango especificado
        int numeroAleatorio = numeroAleatorio(min, max);

        int intento;
        do {
            System.out.print(
                "Adivina el número entre " + min + " y " + max + ": "
            );
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
            }
        } while (intento != numeroAleatorio);
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
    Se definen los valores mínimo y máximo para el rango del número aleatorio (1 y 20).
    Se llama al método numeroAleatorio(min, max) para generar un número aleatorio dentro
    del rango especificado.
    Se utiliza un bucle do-while para permitir al usuario intentar adivinar el número.
    El programa le indica si el número ingresado es mayor o menor que el número aleatorio
    hasta que lo adivine correctamente.

Método numeroAleatorio(int min, int max):
    Este método utiliza Math.random() para generar un número aleatorio en el rango especificado.
    La expresión (Math.random() * (max - min + 1)) + min asegura que el número generado esté entre min
    y max, incluyendo ambos extremos.
    Este código proporciona una implementación completa del juego de adivinanza, donde el usuario
    intenta adivinar un número aleatorio generado dentro de un rango específico.
*/
