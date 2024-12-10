import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingresa el primer valor: ");
        double numero1 = miScanner.nextDouble();

        System.out.println("Ingresa el segundo valor: ");
        double numero2 = miScanner.nextDouble();

        System.out.println("Seleccione su operación: ");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicación ");
        System.out.println("4. División ");
        int operacion = miScanner.nextInt();

        double resultado = 0;

        if (operacion == 1) {
            resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operacion == 2) {
            resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (operacion == 3) {
            resultado = numero1 * numero2;
            System.out.println(
                "El resultado de la multiplicación es: " + resultado
            );
        } else if (operacion == 4) {
            resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        }
        miScanner.close();
    }
}
