public class GeneradorNumerosAleatorios {

    public static void main(String[] args) {
        // Llamar al método para generar un número aleatorio y mostrarlo
        int numero = numeroAleatorio();
        System.out.println("Número aleatorio generado: " + numero);
    }

    // Método que genera un número aleatorio entre 1 y 355
    public static int numeroAleatorio() {
        // Generar un número aleatorio en el rango de 1 a 355
        return (int) Math.floor(Math.random() * 355) + 1;
    }
}
/*
Explicación del código:

Método main:
    Se llama al método numeroAleatorio() y se almacena el número generado en la variable numero.
    Luego, se imprime el número aleatorio en la consola.

Método numeroAleatorio():
    Utiliza Math.random() para generar un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusive).
    Multiplica el resultado por 355 para obtener un número en el rango de 0 a 354.999...
    Aplica Math.floor() para redondear hacia abajo, obteniendo un número entero entre 0 y 354.

Finalmente, se suma 1 para ajustar el rango a 1-355.
Este código generará y mostrará un número aleatorio entre 1 y 355 cada vez que se ejecute.
*/
