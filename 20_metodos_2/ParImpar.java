import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Integer numero = solicitarNumero();
        if (esPar(numero)) {
            System.out.println("El " + numero + " es par");
        } else {
            System.out.println("El " + numero + " no es par");
        }
    }

    public static Integer solicitarNumero() {
        Scanner superscanner = new Scanner(System.in);
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = superscanner.nextInt();
            } catch (Exception e) {
                superscanner.nextLine(); // Limpiar el buffer
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        return numero;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
/*
Explicación de los cambios:

Método solicitarNumero(): Este método se encarga de solicitar un número al usuario y manejar las
excepciones en caso de que el usuario no ingrese un número válido. Devuelve el número ingresado.

Método esPar(int numero): Este método recibe un entero y devuelve true si el número es par
(es decir, si el resto de la división entre 2 es 0), y false en caso contrario.

Lógica en main: En el método main, se llama a solicitarNumero() para obtener el número y luego
se utiliza esPar(numero) para determinar si el número es par o no, imprimiendo el resultado correspondiente.
Con estos cambios, el código es más modular y fácil de mantener.

En este código se utiliza la clase `Integer` (en lugar del tipo primitivo `int`) por dos razones principales:

1. **Manejo de null:**
   - `Integer` es una clase envoltorio (wrapper) que puede contener el valor `null`
   - En el método `solicitarNumero()`, se inicializa `numero` como `null` para usarlo como condición de control en el bucle `do-while`
   - Un tipo primitivo `int` no puede ser `null`, siempre debe tener un valor (por defecto 0)

2. **Control de validación:**
   - Al usar `Integer`, podemos verificar si el usuario ha ingresado un número válido
   - Si el usuario ingresa algo que no es un número, `numero` permanecerá como `null`
   - Esto nos permite mantener el bucle hasta que se ingrese un número válido

Sin embargo, es importante notar que en el método `esPar()` se usa `int` en lugar de `Integer` porque:
- Ya sabemos que el número es válido en ese punto
- Los tipos primitivos son más eficientes para operaciones matemáticas simples
- No necesitamos la funcionalidad adicional que proporciona la clase `Integer`

Un ejemplo equivalente usando `int` requeriría una lógica diferente para la validación:

```java
public static int solicitarNumero() {
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    boolean entradaValida = false;

    do {
        try {
            numero = scanner.nextInt();
            entradaValida = true;
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("No ingresó un número, intente nuevamente:");
        }
    } while (!entradaValida);

    return numero;
}

*/
