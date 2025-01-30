import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        Scanner superscanner = new Scanner(System.in);
        int puntuacion;

        System.out.print("Ingrese un número entre 0 y 100: ");
        puntuacion = superscanner.nextInt();

        // Validar que la puntuación esté en el rango correcto
        if (puntuacion < 0 || puntuacion > 100) {
            System.out.println(
                "Puntuación no válida. Debe estar entre 0 y 100."
            );
        } else {
            String calificacion = obtenerNota(puntuacion);
            System.out.println("La calificación es: " + calificacion);
        }
    }

    public static String obtenerNota(int puntuacion) {
        return switch (puntuacion / 10) {
            case 10, 9 -> "A"; // 90-100
            case 8 -> "B"; // 80-89
            case 7 -> "C"; // 70-79
            case 6 -> "D"; // 60-69
            default -> "F"; // 0-59
        };
    }
}
/*
1. Método main:
Se crea un objeto Scanner para leer la entrada del usuario.
Se solicita al usuario que ingrese un número entre 0 y 100.
Se valida que la puntuación esté dentro del rango permitido.
Si no lo está, se muestra un mensaje de error.
Si la puntuación es válida, se llama al método obtenerNota(puntuacion)
para obtener la calificación y se imprime en la consola.

2. Método obtenerNota(int puntuacion):
Utiliza una expresión switch para determinar la calificación basada
en el valor de puntuacion / 10. Esto permite agrupar las puntuaciones en rangos de diez.
Los casos 10 y 9 devuelven "A", el caso 8 devuelve "B", el caso 7 devuelve "C",
el caso 6 devuelve "D", y cualquier otro valor (que corresponde a puntuaciones menores a 60)
devuelve "F".
Este código es una implementación sencilla y efectiva para calificar
un número ingresado por el usuario utilizando una expresión switch.
*/
