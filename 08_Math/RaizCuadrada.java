/*
Escribe un programa que pida al usuario un número positivo y calcule su raíz
cuadrada utilizando el método sqrt() de la clase Math. Si el número ingresado es
negativo, muestra un mensaje adecuado en pantalla.
*/
import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner superScanner = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo: ");
        int numero = superScanner.nextInt();

        if (numero > 0) {
            System.out.println("El resultado es: " + Math.sqrt(numero));
        } else {
            System.out.println(
                "El numero " + numero + " ingresado no es valido"
            );
        }

        superScanner.close();
    }
}
