import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManipularOraciones {

    private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearOBorrarOracion(scanner);
                    break;
                case 2:
                    cantidadCaracteres();
                    break;
                case 3:
                    cantidadPalabras();
                    break;
                case 4:
                    mostrarPalabrasOrdenadas();
                    break;
                case 5:
                    ingresarNumeroYDevolverPalabra(scanner);
                    break;
                case 6:
                    buscarPalabra(scanner);
                    break;
                case 7:
                    modificarPalabra(scanner);
                    break;
                case 8:
                    agregarContenido(scanner);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("""
		--- Menú de Opciones ---
        1. Crear oración o Borrar oración
        2. Cantidad de caracteres de la oración
        3. Cantidad de palabras de la oración
        4. Mostrar palabras ordenadas alfabéticamente
        5. Ingresar un número y devolver la palabra correspondiente
        6. Buscar palabra dentro de la oración
        7. Modificar palabra dentro de la oración
        8. Agregar contenido a la oración
        9. Salir """);
        System.out.print("Seleccione una opción: ");
    }

    private static void crearOBorrarOracion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese una nueva oración: ");
            oracion = scanner.nextLine();
            System.out.println("Oración creada: " + oracion);
        } else {
            System.out.println("Oración actual: " + oracion);
            System.out.print("¿Desea borrar la oración? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                oracion = "";
                System.out.println("Oración borrada.");
            }
        }
    }

    private static void cantidadCaracteres() {
        System.out.println("Cantidad de caracteres en la oración: " + oracion.length());
    }

    private static void cantidadPalabras() {
        String[] palabras = oracion.trim().split("\\s+");
        System.out.println("Cantidad de palabras en la oración: " + palabras.length);
    }

    private static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.trim().split("\\s+");
        ArrayList<String> listaPalabras = new ArrayList<>();
        Collections.addAll(listaPalabras, palabras);
        Collections.sort(listaPalabras);
        System.out.println("Palabras ordenadas alfabéticamente: " + listaPalabras);
    }

    private static void ingresarNumeroYDevolverPalabra(Scanner scanner) {
        String[] palabras = oracion.trim().split("\\s+");
        System.out.print("Ingrese un número (1-" + palabras.length + "): ");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= palabras.length) {
            System.out.println("Palabra en la posición " + numero + ": " + palabras[numero - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    private static void buscarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();
        String[] palabras = oracion.trim().split("\\s+");
        boolean encontrada = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraBuscada)) {
                System.out.println("Palabra encontrada en la posición " + (i + 1));
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Palabra no encontrada.");
        }
    }

    private static void modificarPalabra(Scanner scanner) {
    System.out.print("Ingrese la palabra que desea cambiar: ");
    String palabraAntigua = scanner.nextLine();
    String[] palabras = oracion.trim().split("\\s+");
    boolean encontrada = false;

    // Buscar la palabra en la oración
    for (int i = 0; i < palabras.length; i++) {
        if (palabras[i].equalsIgnoreCase(palabraAntigua)) {
            encontrada = true;
            System.out.print("Ingrese la nueva palabra: ");
            String nuevaPalabra = scanner.nextLine();
            // Validar que la nueva palabra contenga solo letras y espacios
            if (nuevaPalabra.matches("[a-zA-Z ]+")) {
                palabras[i] = nuevaPalabra; // Reemplazar la palabra
                oracion = String.join(" ", palabras); // Actualizar la oración
                System.out.println("Oración modificada: " + oracion);
            } else {
                System.out.println("La nueva palabra debe contener solo letras y espacios.");
            }
            break;
        }
    }

    if (!encontrada) {
        System.out.println("Palabra no encontrada.");
    }
}

private static void agregarContenido(Scanner scanner) {
    System.out.print("Ingrese el contenido que desea agregar: ");
    String contenido = scanner.nextLine();
    // Agregar el contenido al final de la oración
    oracion += " " + contenido;
    System.out.println("Oración actualizada: " + oracion);
}

}
