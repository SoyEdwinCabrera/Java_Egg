import java.util.Scanner;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        factorialCalculator();
        fibonacci();
    }

    public static void factorialCalculator() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long factorial = 1; // Usamos long para manejar números grandes

        System.out.print("Introduce un número para calcular su factorial: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println(
                "El factorial no está definido para números negativos."
            );
        } else {
            int contador = 1;
            do {
                factorial *= contador; // Multiplicamos el contador al factorial
                contador++; // Incrementamos el contador
            } while (contador <= numero);

            System.out.println(
                "El factorial de " + numero + " es: " + factorial
            );
        }
    }

    public static void fibonacci() {
        Scanner superscanner = new Scanner(System.in);
        int posicion = -1;

        while (posicion < 0) {
            try {
                System.out.println(
                    "Ingresa una posicion de la serie Fibonacci "
                );
                posicion = superscanner.nextInt();
                if (posicion < 0) {
                    System.out.println(
                        "Solamente numeros positivos campeon 😉"
                    );
                }
            } catch (Exception e) {
                System.out.println(
                    "Cariño, debes ingresar un número entero 🥸"
                );
                superscanner.next();
            }
        }

        int a = 0;
        int b = 1;
        int contador = 0;

        for (contador = 0; contador <= posicion; contador++) {
            System.out.print(a + " ");
            int siguientePosicion = a + b;
            a = b;
            b = siguientePosicion;
        }
    }
}
