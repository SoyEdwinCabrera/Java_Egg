import java.util.Scanner;

public class Metodos {

    static Scanner superscanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = leerNombre();
        int edad = leerEdad();
        imprimeNombreYEdad(nombre, edad);
        superscanner.close();
    }

    public static String leerNombre() {
        System.out.print("Ingresa tu nombre: ");
        return superscanner.nextLine();
    }

    public static int leerEdad() {
        System.out.print("Ingresa tu edad: ");
        return superscanner.nextInt();
    }
    /*
    Además, hay otro detalle a tener en cuenta: cuando uses `nextInt()`
    seguido de `nextLine()`, puede haber problemas con el salto
    de línea que queda en el buffer. Si necesitas leer un entero
    y luego una cadena, es recomendable usar `scanner.nextLine()`
    después de `scanner.nextInt()` para consumir el salto de
    línea pendiente.
    */
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println(
            "Me llamo " + nombre + " y tengo " + edad + " años."
        );
    }
}
