/* Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero.
Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de forma manual
e imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento. */
import java.util.Scanner;

public class Promediando {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[4];

        System.out.println("Ingrese el primer numero: ");
        arreglo[0] = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        arreglo[1] = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        arreglo[2] = sc.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        arreglo[3] = sc.nextInt();

        int suma = arreglo[0] + arreglo[1] + arreglo[2] + arreglo[3];
        double promedio = suma / arreglo.length;

        System.out.println("La suma del arreglo es: " + suma);
        System.out.println("El promedio del arreglo es: " + promedio);

        sc.close();
        /* PRIMERA VERSION

        Scanner sc = new Scanner(System.in);

        int numero1, numero2, numero3, numero4;

         System.out.println("Ingrese el primer numero: ");
        numero1 = sc.nextInt(); // arreglo[0] = sc.nextInt;
        System.out.println("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numero3 = sc.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        numero4 = sc.nextInt();
        int[] arreglo = {numero1, numero2, numero3, numero4};

        int suma = arreglo[0] + arreglo[1] + arreglo[2] + arreglo[3];
        double promedio = suma / arreglo.length;

        System.out.println("La suma del arreglo es: "+ suma);
        System.out.println("El promedio del arreglo es: "+ promedio);

        sc.close();
         */

    }
}
