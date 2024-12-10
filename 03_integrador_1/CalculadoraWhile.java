import java.util.Scanner;

/*
En el siguiente codigo se aclaran situaciones que mencionamos durante la sesión
por ejemplo:
1. Valida que solo se ingresen valores numericos para realizar la operacion(No Caracteres).
2. Se organiza el codigo para mejorar la EXPERIENCIA DE USUARIO al momento de ingresar info.
3. El ciclo while permite regresar al punto en el que se solicita la operación si el usuario
   ingresa una opción inválida.
*/
public class CalculadoraWhile {

    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner miScanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Por favor, ingresa el primer número: ");
        double numero1 = validarNumero(miScanner);

        int operacion;
        while (true) {
            try {
                // Mostrar las opciones de operación al usuario
                System.out.println(
                    "Selecciona la operación que deseas realizar:"
                );
                System.out.println("1. Suma (+)");
                System.out.println("2. Resta (-)");
                System.out.println("3. Multiplicación (*)");
                System.out.println("4. División (/)");
                System.out.print("Ingresa el número de la operación (1-4): ");

                operacion = miScanner.nextInt();

                // Validar si la opción está en el rango permitido
                if (operacion >= 1 && operacion <= 4) {
                    break; // Salir del bucle si la opción es válida
                } else {
                    System.out.println(
                        "Opción no válida. Por favor, selecciona un número del 1 al 4."
                    );
                }
            } catch (Exception e) {
                System.out.println(
                    "Entrada inválida. Por favor, ingresa un número del 1 al 4."
                );
                miScanner.next(); // Limpiar la entrada incorrecta
            }
        }

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Por favor, ingresa el segundo número: ");
        double numero2 = validarNumero(miScanner);

        // Declarar una variable para almacenar el resultado
        double resultado = 0;

        // Realizar la operación seleccionada
        switch (operacion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println(
                    "El resultado de la multiplicacion es: " + resultado
                );
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println(
                        "El resultado de la division es: " + resultado
                    );
                } else {
                    System.out.println(
                        "Error: no se puede dividir entre cero."
                    );
                }
                break;
            default:
                System.out.println("La operacion no es valida ");
                break;
        }

        // Cerrar el objeto Scanner
        miScanner.close();
    }

    // Método para validar que la entrada sea un número
    private static double validarNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.print(
                    "Entrada inválida. Por favor, ingresa un número válido: "
                );
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }
    }
}
