/*
Escribe un programa que pida al usuario un número positivo y calcule su raíz
cuadrada utilizando el método sqrt() de la clase Math. Si el número ingresado es
negativo, muestra un mensaje adecuado en pantalla.
*/

import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base y el exponente
        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa el exponente: ");
        double exponente = scanner.nextDouble();

        // Calcular y mostrar el resultado usando el operador ternario
        System.out.println(
            (base == 0 && exponente == 0)
                ? "La base y el exponente no pueden ser ambos cero."
                : "El resultado de elevar " +
                base +
                " a la potencia " +
                exponente +
                " es: " +
                Math.pow(base, exponente)
        );

        scanner.close();
    }
}
