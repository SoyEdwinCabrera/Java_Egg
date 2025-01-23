import java.util.Scanner;

public class Clase15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String oracion = ""; // Declarar la oración aquí

        int opc;
        do {
            System.out.println(
                """
                ----Menú de opciones----
                                1. Crear oración o Borrar oración.
                                2. Cantidad de caracteres de la oración
                                3. Cantidad de palabras de la oración
                                4. Mostrar palabras ordenadas alfabéticamente
                                5. Ingresar un número y devolver la palabra correspondiente
                                6. Buscar palabra dentro de la oración
                                7. Modificar palabra dentro de la oración
                                8. Agregar contenido a la oración
                                9. Salir: Terminar el programa.
                                                    """
            );
            System.out.print("---> ");
            opc = scan.nextInt();
            scan.nextLine(); // Limpiar el buffer

            while (opc < 1 || opc > 9) {
                System.out.println("Ingrese una opción válida");
                opc = scan.nextInt();
                scan.nextLine(); // Limpiar el buffer
            }

            switch (opc) {
                case 1:
                    oracion = crearOracion(scan, oracion);
                    break;
                case 2:
                    cantidadCaracteres(oracion);
                    break;
                case 3:
                    int cantidad = cantidadPalabras(oracion);
                    System.out.println(
                        "La cantidad de palabras en la oración es: " + cantidad
                    );
                    break;
                case 4:
                    mostrarPalabrasOrdenadas(oracion);
                    break;
                case 5:
                    System.out.println(
                        "Ingrese un número para ver la palabra correspondiente a esa posición en la oración:"
                    );
                    int position = scan.nextInt();
                    scan.nextLine(); // Limpiar el buffer
                    String resultado = palabraPosicion(position, oracion);
                    System.out.println(resultado);
                    break;
                case 6:
                    buscarPalabra(scan, oracion);
                    break;
                case 7:
                    oracion = modificarPalabra(scan, oracion);
                    break;
                case 8:
                    oracion = agregarContenido(scan, oracion);
                    break;
                case 9:
                    break;
                default:
                    break;
            }
            System.out.println("Nueva oración: " + oracion);
        } while (opc != 9);

        scan.close(); // Cerrar el scanner al final
    }

    // Método 1: Crear o borrar oración
    public static String crearOracion(Scanner scan, String oracion) {
        if (oracion.isEmpty()) {
            System.out.println("Inserte una oración:");
            oracion = scan.nextLine();
        } else {
            System.out.println("Ya hay un mensaje escrito: " + oracion + ".");
            System.out.println(
                """
                ¿Desea borrarlo?
                1. Sí
                2. No
                """
            );
            int opc = scan.nextInt();
            scan.nextLine(); // Limpiar el buffer

            while (opc != 1 && opc != 2) {
                System.out.println("Ingrese una opción válida:");
                opc = scan.nextInt();
                scan.nextLine(); // Limpiar el buffer
            }

            // Borrado de la oración
            if (opc == 1) {
                oracion = "";
            }
        }
        return oracion;
    }

    // Método 2: Agregar contenido a la oración
    public static String agregarContenido(Scanner scan, String oracion) {
        System.out.print(
            "Ingrese el contenido que desea agregar a la oración: "
        );
        String contenido = scan.nextLine();
        oracion += " " + contenido;
        return oracion;
    }

    // Método 3: Modificar palabra dentro de la oración
    public static String modificarPalabra(Scanner scan, String oracion) {
        while (true) {
            System.out.print("Ingrese la palabra que desea cambiar: ");
            String palabraOriginal = scan.nextLine();

            if (!oracion.contains(palabraOriginal)) {
                System.out.println(
                    "Error: La palabra no se encuentra en la oración. Intente nuevamente."
                );
                continue;
            }

            System.out.print(
                "Ingrese la nueva palabra o frase para reemplazar \"" +
                palabraOriginal +
                "\": "
            );
            String palabraNueva = scan.nextLine();

            if (!palabraNueva.matches("[a-zA-Z ]+")) {
                System.out.println(
                    "Error: La nueva palabra solo debe contener letras y espacios. Intente nuevamente."
                );
                continue;
            }

            oracion = oracion.replace(palabraOriginal, palabraNueva);
            break;
        }
        return oracion;
    }

    // Método 4: Obtener la palabra en una posición específica
    public static String palabraPosicion(int position, String oracion) {
        String[] palabras = oracion.split("\\s+");
        if (position > 0 && position <= palabras.length) {
            return palabras[position - 1];
        }
        return "Error: la oración no tiene tantas palabras.";
    }

    // Método 5: Mostrar palabras ordenadas alfabéticamente
    public static void mostrarPalabrasOrdenadas(String oracion) {
        String[] palabras = oracion.split("\\s+");
        // Ordenar las palabras usando un algoritmo de burbuja
        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j]) > 0) {
                    String temp = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = temp;
                }
            }
        }
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    // Método 6: Buscar palabra dentro de la oración
    public static void buscarPalabra(Scanner scan, String oracion) {
        System.out.print("Ingrese la palabra que desea buscar en la oración: ");
        String palabra = scan.nextLine();

        if (palabra.trim().isEmpty()) {
            System.out.println("Error: No se ingresó una palabra válida.");
            return;
        }

        int posicion = oracion.indexOf(palabra);

        if (posicion != -1) {
            System.out.println(
                "La palabra \"" + palabra + "\" fue encontrada en la oración."
            );
            System.out.println("Se encuentra en la posición: " + posicion);
        } else {
            System.out.println(
                "La palabra \"" + palabra + "\" no se encuentra en la oración."
            );
        }
    }

    // Método 7: Contar la cantidad de palabras en la oración
    public static int cantidadPalabras(String oracion) {
        // Eliminar espacios extra al inicio y final, y dividir la oración por espacios
        String[] palabras = oracion.trim().split("\\s+");
        // Retornar la cantidad de palabras
        return palabras.length;
    }

    // Método 8: Contar la cantidad de caracteres en la oración
    public static void cantidadCaracteres(String oracion) {
        int cantidad = oracion.length();
        System.out.println(
            "La cantidad total de caracteres en la oración es: " + cantidad
        );
    }
}
