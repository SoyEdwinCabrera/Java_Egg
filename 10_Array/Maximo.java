/*Escribe un programa en el cual se cree una variable de tipo
array que contenga cinco elementos de tipo entero, ingresados por el usuario.
El programa debe buscar el máximo e imprimir por consola el resultado utilizando
solamente las herramientas adquiridas hasta el momento. */

import java.util.Arrays;
import java.util.Scanner;

public class Maximo {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números: ");
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();

        int max = 0;

        /*if (numeros[1] > max) {
            max = numeros[1];
        }
        if (numeros[2] > max) {
            max = numeros[2];
        }
        if (numeros[3] > max) {
            max = numeros[3];
        }
        if (numeros[4] > max) {
            max = numeros[4];
        }*/

        max = Arrays.stream(numeros).max().orElse(0);

        System.out.println("El valor máximo es: " + max);

        sc.close();
    }
}
