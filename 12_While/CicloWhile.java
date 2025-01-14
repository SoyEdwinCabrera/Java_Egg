import java.util.Random;
import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {
        Random superrandom = new Random();
        int numeroAleatorio = superrandom.nextInt(20) + 1;
        int miNumero;
        Scanner superscanner = new Scanner(System.in);

        do {
            System.out.println("Adivina el número entre 1 y 20: ");
            miNumero = superscanner.nextInt();
            if (miNumero < numeroAleatorio) {
                System.out.println("Tu número es menor.");
            } else if (miNumero > numeroAleatorio) {
                System.out.println("Tu número es mayor.");
            }
        } while (miNumero != numeroAleatorio);
        System.out.println(" Buena esa CAMPEON !!! 😀");
        superscanner.close();
    }
}
