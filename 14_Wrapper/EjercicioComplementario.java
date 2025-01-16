import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner superscanner = new Scanner(System.in);

        contarEspacios(superscanner);
        sumaNumeros(superscanner);
        contarDigitos(superscanner);

        superscanner.close();
    }

    public static void contarEspacios(Scanner superscanner) {
        System.out.print("Introduce una cadena: ");
        String cadena = superscanner.nextLine();
        int contadorEspacios = 0;
        for (char c : cadena.toCharArray()) {
            if (Character.isWhitespace(c)) {
                contadorEspacios++;
            }
        }
        System.out.println("Número de espacios en blanco: " + contadorEspacios);
    }

    public static void sumaNumeros(Scanner superscanner) {
        System.out.print("Introduce un número entero: ");
        String numeroEntero = superscanner.nextLine();
        System.out.print("Introduce un número decimal: ");
        String numeroDecimal = superscanner.nextLine();
        int entero = Integer.valueOf(numeroEntero);
        double decimal = Double.valueOf(numeroDecimal);
        double suma = entero + decimal;
        System.out.println("La suma es: " + suma);
    }

    public static void contarDigitos(Scanner superscanner) {
        System.out.print("Introduce un número: ");
        String numero = superscanner.nextLine();
        int contadorDigitos = 0;
        for (char c : numero.toCharArray()) {
            if (Character.isDigit(c)) {
                contadorDigitos++;
            }
        }
        System.out.println("Número de dígitos: " + contadorDigitos);
    }
}
