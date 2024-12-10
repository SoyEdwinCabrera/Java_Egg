import java.util.Scanner;

public class ParOImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        System.out.println(
            "El número ingresado es " +
            ((numero % 2 == 0) ? "par" : "impar") +
            "."
        );

        scanner.close();
    }
}
