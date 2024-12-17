/* Escribe un programa que genere y muestre en pantalla un número aleatorio en el
rango del 1 al 355 utilizando el método random() de la clase Math. Puedes utilizar el
método floor() para redondear el número aleatorio hacia abajo. */

public class NumeroAleatorio {

    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 355
        int numeroAleatorio = (int) Math.floor(Math.random() * 355) + 1;

        // Mostrar el número generado en pantalla
        System.out.println(
            "El número aleatorio generado es: " + numeroAleatorio
        );
    }
}
