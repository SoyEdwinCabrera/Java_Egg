/*
Escribe un programa en el cual se cree una variable de tipo array que contenga tres
elementos de tipo entero. El programa debe sumar los tres elementos de forma
manual e imprimir por consola el resultado utilizando solamente las herramientas
adquiridas hasta el momento.
*/

public class Paco {

    public static void main(String[] args) {
        int[] superarray = { 205, 385, 1 };

        System.out.println(
            "La suma del superarray es: " +
            (superarray[0] + superarray[1] + superarray[2])
        );
    }
}
