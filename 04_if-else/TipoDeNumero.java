import java.util.Scanner;

public class TipoDeNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario ingresar un número
        System.out.print("Por favor ingresa un número: ");
        double numeroIngresado = scanner.nextDouble();

        // Validar el numero
        if (numeroIngresado > 0) {
            System.out.println("El número ingresado es positivo");
        } else if (numeroIngresado < 0) {
            System.out.println("El número ingresado es negativo");
        } else {
            System.out.println("El número ingresado es cero");
        }
        /*
        // Uso de operador ternario
        String resultado = (numeroIngresado > 0) ? "positivo" :
                           (numeroIngresado < 0) ? "negativo" : "cero";

        System.out.println("El número ingresado es " + resultado);
        */
        scanner.close();
    }
}
