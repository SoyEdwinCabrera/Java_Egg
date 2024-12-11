import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("ingresa una puntuación entre 0 y 100: ");
            int puntuacion = scanner.nextInt();

            if (puntuacion >= 90 && puntuacion <= 100) {
                System.out.println("La calificación es: A");
            } else if (puntuacion >= 80 && puntuacion <= 89) {
                System.out.println("La calificación es: B");
            } else if (puntuacion >= 70 && puntuacion <= 79) {
                System.out.println("La calificación es: C");
            } else if (puntuacion >= 60 && puntuacion <= 69) {
                System.out.println("La calificación es: D");
            } else if (puntuacion >= 0 && puntuacion < 60) {
                System.out.println("La calificación es: F");
            } else {
                System.out.println("Puntuación no válida");
            }

            scanner.close();
        }
    }
}
