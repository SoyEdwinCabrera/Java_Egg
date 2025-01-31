import java.util.Random;
import java.util.Scanner;

public class EjercicioComplementario {

    private static final String[] PALABRAS = {"casa", "perro", "gato", "elefante", "programacion", "java", "computadora"};
    private static String palabraSeleccionada;
    private static String pista;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Seleccionar una palabra aleatoria
        palabraSeleccionada = PALABRAS[random.nextInt(PALABRAS.length)];
        pista = obtenerPista(palabraSeleccionada);
        
        System.out.println("¡Bienvenido al juego de adivinar la palabra!");
        System.out.println("La palabra tiene " + palabraSeleccionada.length() + " letras.");
        System.out.println("Pista: " + pista);
        
        int intentosMaximos = 5;
        boolean adivinado = false;

        for (int i = 0; i < intentosMaximos; i++) {
            System.out.print("Intento " + (i + 1) + ": Ingresa una letra o la palabra completa: ");
            String intento = scanner.nextLine().toLowerCase();

            if (intento.equals(palabraSeleccionada)) {
                adivinado = true;
                break;
            } else {
                comprobarLetra(intento);
            }

            System.out.println("Pista actual: " + pista);
        }

        if (adivinado) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSeleccionada);
        } else {
            System.out.println("Lo siento, no has adivinado la palabra. La palabra era: " + palabraSeleccionada);
        }

        scanner.close();
    }

    private static String obtenerPista(String palabra) {
        StringBuilder pistaBuilder = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            pistaBuilder.append("_ ");
        }
        return pistaBuilder.toString().trim();
    }

    private static void comprobarLetra(String intento) {
        if (intento.length() == 1) {
            char letra = intento.charAt(0);
            StringBuilder nuevaPista = new StringBuilder(pista);

            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letra) {
                    nuevaPista.setCharAt(i * 2, letra); // Actualizar la pista
                }
            }

            pista = nuevaPista.toString();
        } else {
            System.out.println("Por favor, ingresa solo una letra o intenta adivinar la palabra completa.");
        }
    }
}

