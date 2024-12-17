/* Escribe un programa que pida al usuario un número decimal y muestra en pantalla
su valor redondeado utilizando el método round() de la clase Math.*/

import java.util.Scanner;

public class RedondeoNumeros {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número decimal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        // Redondear el número utilizando el método round() de la clase Math
        long numeroRedondeado = Math.round(numeroDecimal);
        // Mostrar el número redondeado en pantalla
        System.out.println(
            "El número redondeado de " +
            numeroDecimal +
            "es: " +
            numeroRedondeado
        );
        scanner.close();
    }
}
