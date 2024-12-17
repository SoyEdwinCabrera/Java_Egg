/* Escribe un programa que pida al usuario dos números enteros, representando la
base y el exponente, y calcula el resultado de elevar la base al exponente utilizando
el método pow() de la clase Math. Muestra el resultado en pantalla.*/

import java.util.Scanner;

public class CalculoPotencia {

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
/*
Contexto Matemático: Base = 0 y Exponente = 0
En matemáticas, la expresión O**0 (cero elevado a la potencia de cero) es un caso indeterminado. Esto significa que no tiene un valor definido de forma universal y puede generar diferentes interpretaciones dependiendo del contexto.

En algunas situaciones (como en combinatoria o análisis matemático), 0**0 se define como 1 para que ciertas fórmulas sean consistentes.

En otras situaciones, especialmente en álgebra o cálculo, 0**0 es considerado indeterminado porque:

0 elevado a cualquier exponente positivo es 0.
Cualquier número (excepto 0) elevado a 0 es 1.

Debido a esta ambigüedad, los sistemas de programación y software generalmente tratan 0**0 con precaución.

*/
