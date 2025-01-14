import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        contarElementosPares();
        calcularPromedio();
        concatenarElementos();
        contarOcurrencias();
    }

    // Actividad 1: Contando Elementos Pares
    public static void contarElementosPares() {
        int[] numeros = new int[10];
        Random random = new Random();

        // Inicializar el array con números aleatorios menores a 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }

        // Imprimir todos los elementos del array en una única línea usando for-each
        System.out.print("Elementos del array: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Contar elementos pares usando un ciclo for
        int contadorPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        // Mostrar el total de elementos pares
        System.out.println("Total de elementos pares: " + contadorPares);
        System.out.println();
    }

    // Actividad 2: Calculando el promedio
    public static void calcularPromedio() {
        float[] numeros = {
            10.5f,
            20.0f,
            30.5f,
            40.0f,
            50.5f,
            60.0f,
            70.5f,
            80.0f,
            90.5f,
            100.0f,
            110.5f,
            120.0f,
            130.5f,
            140.0f,
            150.5f,
            160.0f,
            170.5f,
            180.0f,
            190.5f,
            200.0f,
        };

        // Sumar todos los elementos del array usando for-each
        float suma = 0;
        for (float num : numeros) {
            suma += num;
        }

        // Calcular el promedio
        float promedio = suma / numeros.length;

        // Mostrar la suma y el promedio
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println();
    }

    // Actividad 3: Concatenando elementos
    public static void concatenarElementos() {
        String[] cadenas = { "Hola", "mundo", "esto", "es", "Java" };
        StringBuilder resultado = new StringBuilder();

        // Concatenar los elementos en una sola cadena usando for-each
        for (String cadena : cadenas) {
            resultado.append(cadena).append(" "); // Agregar cada cadena y un espacio
        }

        // Imprimir el resultado
        System.out.println(
            "Cadena concatenada: " + resultado.toString().trim()
        );
        System.out.println();
    }

    // Actividad Complementaria: Contar ocurrencias
    public static void contarOcurrencias() {
        char[] frase = "aprender java".toCharArray(); // Frase inicial
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un carácter objetivo
        System.out.print("Ingresa un carácter para contar sus ocurrencias: ");
        char objetivo = scanner.next().charAt(0);

        // Contar ocurrencias del carácter usando for
        int contador = 0;
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == objetivo) {
                contador++;
            }
        }

        // Mostrar el resultado
        if (contador > 0) {
            System.out.println(
                "El carácter \"" +
                objetivo +
                "\" aparece " +
                contador +
                " veces."
            );
        } else {
            System.out.println(
                "El carácter \"" + objetivo + "\" no aparece en la frase."
            );
        }
        scanner.close();
    }
}
