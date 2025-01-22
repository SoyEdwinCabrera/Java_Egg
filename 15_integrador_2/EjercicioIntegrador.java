import java.util.Random;
import java.util.Scanner;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        passwordGenerator();
        complementoEstadisticas();
        fibonacci();
    }

    public static void passwordGenerator() {
        System.out.println("*** EJERCICIO GENERADOR DE CONTRASEÑAS ***");
        Scanner scanner = new Scanner(System.in);
        int longitud = 0;
        Random random = new Random();
        int contador = 0;
        do {
            System.out.println("Introduce la longitud de la cadena :");
            longitud = scanner.nextInt();
        } while (longitud < 3);

        char[] arrayContrasena = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            contador++;
            switch (contador) {
                case 1:
                    arrayContrasena[i] = (char) (random.nextInt(26) + 'A');
                    break;
                case 2:
                    arrayContrasena[i] = (char) (random.nextInt(26) + 'a');
                    break;
                case 3:
                    contador = 0;
                    arrayContrasena[i] = (char) (random.nextInt(10) + '0');
                    break;
            }
        }
        String contrasenaFinal = new String(arrayContrasena);
        System.out.println("Este es el resultado final " + contrasenaFinal);
    }

    public static void complementoEstadisticas() {
        System.out.println("*** EJERCICIO ESTADISTICA DE CALIFICACIONES ***");
        String[] calificaciones = new String[50];
        Random random = new Random();
        Double totalCalificaciones = 0.0;
        int desaprobado = 0, aprobado = 0, excelente = 0;
        for (int i = 0; i < 50; i++) {
            double nota = random.nextDouble() * 10;
            System.out.println("Este es el valor de nota " + nota);
            calificaciones[i] = String.format("%.2f", nota);
            totalCalificaciones += nota;
            if (nota < 4) {
                desaprobado++;
            } else if (nota >= 4 && nota < 10) {
                aprobado++;
            } else {
                excelente++;
            }
        }
        String[] listaDesaprobados = new String[desaprobado];
        String[] listaAprobados = new String[aprobado];
        String[] listaExcelente = new String[excelente];
        int contDes = 0;
        int contApro = 0;
        int contExce = 0;
        for (String j : calificaciones) {
            double nota = Double.parseDouble(j);
            if (nota < 4) {
                listaDesaprobados[contDes] = j;
                contDes++;
            } else if (nota >= 4 && nota < 10) {
                listaAprobados[contApro] = j;
                contApro++;
            } else {
                listaExcelente[contExce] = j;
                contExce++;
            }
        }
        Double promedio;
        promedio = totalCalificaciones / calificaciones.length;
        System.out.println(
            "El promedio de todas las calificaciones es " + promedio
        );
    }

    public static void fibonacci() {
        System.out.println("*** EJERCICIO FIBONACCI ***");
        Scanner scanner = new Scanner(System.in);
        System.out.print(
            "Introduce el número de términos de la serie de Fibonacci que deseas imprimir: "
        );
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int contador = 0;

        System.out.println(
            "Los primeros " + n + " términos de la serie de Fibonacci son:"
        );

        while (contador < n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }

        scanner.close();
    }
}
