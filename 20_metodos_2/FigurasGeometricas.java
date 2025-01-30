import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int figura;

        // Menú para elegir la figura geométrica
        do {
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Paralelogramo");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            figura = scanner.nextInt();

            switch (figura) {
                case 1:
                    calcularCirculo(scanner);
                    break;
                case 2:
                    calcularTriangulo(scanner);
                    break;
                case 3:
                    calcularParalelogramo(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (figura != 4);
    }

    // Método para calcular área y perímetro del círculo
    public static void calcularCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
    }

    // Método para calcular área y perímetro del triángulo
    public static void calcularTriangulo(Scanner scanner) {
        System.out.print("Ingrese la longitud del lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado c: ");
        double c = scanner.nextDouble();
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = a + b + c;

        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);
    }

    // Método para calcular área y perímetro del paralelogramo
    public static void calcularParalelogramo(Scanner scanner) {
        System.out.print("Ingrese la longitud del lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese la base del paralelogramo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del paralelogramo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (a + b);

        System.out.println("Área del paralelogramo: " + area);
        System.out.println("Perímetro del paralelogramo: " + perimetro);
    }
}
/*
Explicación del código:

Método main:
    Se crea un objeto Scanner para leer la entrada del usuario.
    Se presenta un menú para que el usuario elija la figura geométrica.
    El bucle do-while permite que el menú se muestre repetidamente hasta que
    el usuario elija salir (opción 4).
    Dependiendo de la opción seleccionada, se llama al método correspondiente
    para calcular el área y el perímetro de la figura elegida.

Métodos de cálculo:
calcularCirculo(Scanner scanner): Solicita el radio del círculo, calcula el área y el perímetro,
y muestra los resultados.
calcularTriangulo(Scanner scanner): Solicita las longitudes de los lados y la base y altura
del triángulo, calcula el área y el perímetro, y muestra los resultados.
calcularParalelogramo(Scanner scanner): Solicita las longitudes de los lados, la base y
la altura del paralelogramo, calcula el área y el perímetro,
*/
