import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner superscanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println(
                """

                    Calculadora

                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir

                Seleccione una opción:  """
            );

            try {
                opcion = superscanner.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = superscanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = superscanner.nextDouble();
                    double resultado = 0;

                    switch (opcion) {
                        case 1:
                            resultado = num1 + num2;
                            System.out.println(
                                "El resultado de la suma es: " + resultado
                            );
                            break;
                        case 2:
                            resultado = num1 - num2;
                            System.out.println(
                                "El resultado de la resta es: " + resultado
                            );
                            break;
                        case 3:
                            resultado = num1 * num2;
                            System.out.println(
                                "El resultado de la multiplicación es: " +
                                resultado
                            );
                            break;
                        case 4:
                            if (num2 != 0) {
                                resultado = num1 / num2;
                                System.out.println(
                                    "El resultado de la división es: " +
                                    resultado
                                );
                            } else {
                                System.out.println(
                                    "Error: No se puede dividir por cero."
                                );
                            }
                            break;
                    }
                } else if (opcion != 5) {
                    System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println(
                    "Error no ingresó un número, ingrese unn número valido:"
                );
                superscanner.nextLine();
            }
        } while (opcion != 5);

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        superscanner.close();
    }
}
/*
La declaración `public static void main(String[] args)` es el punto de entrada principal
de una aplicación Java. Vamos a desglosarla parte por parte:

```java
public static void main(String[] args)
//1     2     3    4    5    6
```

1. `public`: Es un modificador de acceso que hace que el método sea accesible desde cualquier parte.
    El método main DEBE ser público para que la JVM pueda ejecutarlo.

2. `static`: Significa que el método pertenece a la clase y no a una instancia específica de la clase.
    No necesitas crear un objeto para llamar a un método estático.

3. `void`: Es el tipo de retorno del método. `void` indica que el método no devuelve ningún valor.

4. `main`: Es el nombre del método. La JVM busca específicamente un método llamado "main"
    como punto de entrada.

5. `String[]`: Indica que el método acepta un array de Strings como parámetro.

6. `args`: Es el nombre del parámetro (array) que contiene los argumentos de línea de comandos.
*/
