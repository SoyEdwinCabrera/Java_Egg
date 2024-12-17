import java.util.Scanner;

public class NumeroAleatorioEntreLimites {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los límites inferior y superior
        System.out.print("Ingresa el límite inferior: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Ingresa el límite superior: ");
        int limiteSuperior = scanner.nextInt();

        // Verificar que los límites sean válidos
        if (limiteInferior >= limiteSuperior) {
            System.out.println(
                "El límite inferior debe ser menor que el límite superior."
            );
        } else {
            // Generar número aleatorio entre los límites
            int numeroAleatorio =
                (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) +
                limiteInferior;

            // Mostrar el número generado
            System.out.println(
                "El número aleatorio generado entre " +
                limiteInferior +
                " y " +
                limiteSuperior +
                " es: " +
                numeroAleatorio
            );
        }

        scanner.close();
    }
}
