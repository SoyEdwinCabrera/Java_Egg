import java.util.Scanner;

public class ConversionTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        String unidad;

        try {
            // Solicitar temperatura al usuario
            System.out.print("Ingrese la temperatura: ");
            temperatura = Double.parseDouble(scanner.nextLine());

            // Solicitar unidad de medida al usuario
            System.out.print("Ingrese la unidad de medida (C/F): ");
            unidad = scanner.nextLine().toUpperCase();

            // Comprobar unidad de medida válida y realizar la conversión
            if (unidad.equals("C")) {
                double fahrenheit = ((temperatura * 9) / 5) + 32;
                System.out.println(
                    temperatura +
                    " grados Celsius equivale a " +
                    fahrenheit +
                    " grados Fahrenheit."
                );
            } else if (unidad.equals("F")) {
                double celsius = ((temperatura - 32) * 5) / 9;
                System.out.println(
                    temperatura +
                    " grados Fahrenheit equivale a " +
                    celsius +
                    " grados Celsius."
                );
            } else {
                System.out.println(
                    "Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit."
                );
            }
        } catch (NumberFormatException e) {
            System.out.println(
                "Error: Temperatura no válida. Ingrese una temperatura numérica."
            );
        } finally {
            scanner.close();
        }
    }
}
