import java.util.Scanner;

public class RellenarArregloPersonalizado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        // Crear el arreglo
        int[] array = new int[tamaño];

        // Llamar al método para rellenar el arreglo
        rellenarArray(array);

        // Imprimir el arreglo completo
        System.out.println("Arreglo completo:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Método para rellenar el arreglo
    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int ultimoIndice = -1; // Inicializar el último índice como -1

        while (true) {
            // Solicitar un número para rellenar el arreglo
            System.out.print("Ingrese un número para rellenar el arreglo: ");
            int numero = scanner.nextInt();

            // Solicitar el índice hasta el cual quiere rellenar el arreglo
            System.out.print(
                "Ingrese el índice hasta el cual desea rellenar (debe ser menor que " +
                array.length +
                "): "
            );
            int nuevoIndice = scanner.nextInt();

            // Validar el índice
            if (nuevoIndice < 0 || nuevoIndice >= array.length) {
                System.out.println(
                    "Índice no válido. Debe ser menor que " +
                    array.length +
                    " y mayor o igual a 0."
                );
                continue; // Volver a solicitar el número y el índice
            }

            // Validar que el nuevo índice sea mayor que el último índice
            if (nuevoIndice <= ultimoIndice) {
                System.out.println(
                    "El índice debe ser mayor que el último índice ingresado (" +
                    ultimoIndice +
                    ")."
                );
                continue; // Volver a solicitar el número y el índice
            }

            // Rellenar el arreglo desde el último índice hasta el nuevo índice
            for (int i = ultimoIndice + 1; i <= nuevoIndice; i++) {
                array[i] = numero;
            }

            // Actualizar el último índice
            ultimoIndice = nuevoIndice;

            // Preguntar si se desea continuar
            System.out.print("¿Desea continuar rellenando el arreglo? (s/n): ");
            char continuar = scanner.next().charAt(0);
            if (continuar != 's' && continuar != 'S') {
                break; // Salir del bucle si el usuario no desea continuar
            }
        }
    }
}
/*
Explicación del código:

Método main:
    Se crea un objeto Scanner para leer la entrada del usuario.
    Se solicita al usuario que ingrese el tamaño del arreglo y se crea el arreglo correspondiente.
    Se llama al método rellenarArray(array) para permitir que el usuario rellene el arreglo.
    Finalmente, se imprime el arreglo completo.

Método rellenarArray(int[] array):
    Se inicializa ultimoIndice en -1 para indicar que aún no se ha rellenado ningún índice.
    Se utiliza un bucle while (true) para permitir que el usuario continúe ingresando números
    y índices hasta que decida detenerse.
    Se solicita un número y un índice al usuario.
    Se valida que el índice ingresado sea menor que el tamaño del arreglo y que sea mayor
    que el último índice ingresado.
    Si las validaciones son correctas, se rellena el arreglo desde el último índice hasta
    el nuevo índice con el número proporcionado.
    Se actualiza el ultimoIndice con el nuevo índice ingresado.
    Se pregunta al usuario si desea continuar rellenando el arreglo. Si no, se sale del bucle.
    Este código permite al usuario rellenar un arreglo de manera personalizada, cumpliendo
    con todas las validaciones requeridas
*/
