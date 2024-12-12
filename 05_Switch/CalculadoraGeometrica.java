import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opciones al usuario
        System.out.println("Elige una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.print("Ingresa tu opción (1 o 2): ");
        int figura = scanner.nextInt();

        // Declarar variables necesarias
        final double PI = 3.14159;

        // Switch-expression para determinar la figura seleccionada y realizar las operaciones
        String resultado =
            switch (figura) {
                case 1 -> {
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Elige una operación:");
                    System.out.println("1. Calcular el área");
                    System.out.println("2. Calcular el perímetro");
                    System.out.print("Ingresa tu opción (1 o 2): ");
                    int opcionCirculo = scanner.nextInt();
                    yield switch (opcionCirculo) {
                        case 1 -> "El área del círculo es: " +
                        (PI * Math.pow(radio, 2));
                        case 2 -> "El perímetro del círculo es: " +
                        (2 * PI * radio);
                        default -> "Opción no válida para el círculo.";
                    };
                }
                case 2 -> {
                    System.out.print("Ingresa la base del rectángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa la altura del rectángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Elige una operación:");
                    System.out.println("1. Calcular el área");
                    System.out.println("2. Calcular el perímetro");
                    System.out.print("Ingresa tu opción (1 o 2): ");
                    int opcionRectangulo = scanner.nextInt();
                    yield switch (opcionRectangulo) {
                        case 1 -> "El área del rectángulo es: " +
                        (base * altura);
                        case 2 -> "El perímetro del rectángulo es: " +
                        (2 * (base + altura));
                        default -> "Opción no válida para el rectángulo.";
                    };
                }
                default -> "Opción no válida. Por favor, selecciona 1 o 2.";
            };

        // Imprimir el resultado
        System.out.println(resultado);

        // Cerrar el Scanner
        scanner.close();
    }
}
