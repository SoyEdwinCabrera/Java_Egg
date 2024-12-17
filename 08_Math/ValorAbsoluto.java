/*Aquí tienes el programa en Java que solicita al usuario un número entero y muestra su valor absoluto
utilizando el método Math.abs() de la clase Math:*/

import java.util.Scanner;

public class ValorAbsoluto {

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Calcular el valor absoluto utilizando Math.abs()
        int valorAbsoluto = Math.abs(numero);

        // Mostrar el valor absoluto en pantalla
        System.out.println(
            "El valor absoluto de " + numero + " es: " + valorAbsoluto
        );

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
