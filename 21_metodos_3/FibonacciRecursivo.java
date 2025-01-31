import java.util.Scanner;

public class FibonacciRecursivo {

	public static void main(String[] args) {
	int posicion = pedirPosicion();
	int resultado = calcularFibonacci(posicion);
	mostrarResultado(posicion, resultado);

}//End Main

 // Método para pedir la posición al usuario
    public static int pedirPosicion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición en la serie de Fibonacci: ");
        return scanner.nextInt();
    }

    // Método para calcular el número de Fibonacci en la posición dada
    public static int calcularFibonacci(int posicion) {
        if (posicion < 0) {
            throw new IllegalArgumentException("La posición no puede ser negativa.");
        }
        return calcularFibonacciRecursivo(posicion);
    }

    // Método recursivo para calcular Fibonacci
    private static int calcularFibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacciRecursivo(n - 1) + calcularFibonacciRecursivo(n - 2);
        }
    }

    // Método para mostrar el resultado
    public static void mostrarResultado(int posicion, int resultado) {
        System.out.println("El número de Fibonacci en la posición " + posicion + " es: " + resultado);
    }
}//End Class

/*
La palabra clave throw en Java se utiliza para lanzar excepciones de manera explícita. En el contexto del código que proporcioné, se utiliza para manejar un caso específico en el que la entrada del usuario no es válida. Vamos a desglosar su uso en el método calcularFibonacci:

Contexto del Uso de throw

Aquí está la parte relevante del código:

java
Copy Code
public static int calcularFibonacci(int posicion) {
    if (posicion < 0) {
        throw new IllegalArgumentException("La posición no puede ser negativa.");
    }
    return calcularFibonacciRecursivo(posicion);
}
Explicación del Código

Validación de Entrada:
El método calcularFibonacci recibe un parámetro posicion, que representa la posición en la serie de Fibonacci que el usuario desea calcular.
Antes de proceder con el cálculo, se verifica si la posición es negativa (if (posicion < 0)).
Uso de throw:
Si la posición es negativa, se lanza una excepción utilizando throw.
throw new IllegalArgumentException("La posición no puede ser negativa."); crea una nueva instancia de IllegalArgumentException, que es una excepción predefinida en Java que se utiliza para indicar que un método ha recibido un argumento ilegal o inapropiado.
El mensaje "La posición no puede ser negativa." se pasa al constructor de la excepción, lo que proporciona información adicional sobre el error.
Propósito de Lanzar Excepciones:
Manejo de Errores: Lanzar una excepción permite que el programa maneje errores de manera controlada. En lugar de continuar con un cálculo que no tiene sentido (como calcular un número de Fibonacci para una posición negativa), el programa puede detenerse y notificar al usuario sobre el error.
Claridad: Al lanzar una excepción, se proporciona un mensaje claro que explica por qué ocurrió el error, lo que facilita la depuración y el entendimiento del problema.
Interrupción del Flujo Normal: Cuando se lanza una excepción, el flujo normal del programa se interrumpe, y se puede dirigir a un bloque de manejo de excepciones (try-catch) si se desea manejar el error de manera específica.

*/
