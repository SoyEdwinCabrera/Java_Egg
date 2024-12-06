import java.util.Scanner;

public class CalculadoraAreaPerimetro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar base y altura del rectángulo
        double baseRectangulo = solicitarNumeroDecimal(
            scanner,
            "Por favor ingresa la base del rectángulo: "
        );
        double alturaRectangulo = solicitarNumeroDecimal(
            scanner,
            "Por favor ingresa la altura del rectángulo: "
        );

        // Calcular área y perímetro
        double perimetro = calcularPerimetro(baseRectangulo, alturaRectangulo);
        double area = calcularArea(baseRectangulo, alturaRectangulo);

        // Mostrar resultados
        mostrarResultado("El perímetro del rectángulo es: ", perimetro);
        mostrarResultado("El área del rectángulo es: ", area);

        // Cerrar el Scanner
        scanner.close();
    }

    // Método para solicitar un número decimal al usuario
    private static double solicitarNumeroDecimal(
        Scanner scanner,
        String mensaje
    ) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    // Método para calcular el perímetro
    private static double calcularPerimetro(double base, double altura) {
        return 2 * base + 2 * altura;
    }

    // Método para calcular el área
    private static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Método para mostrar los resultados
    private static void mostrarResultado(String mensaje, double resultado) {
        System.out.println(mensaje + resultado);
    }
}
