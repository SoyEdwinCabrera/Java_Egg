import java.util.Scanner;

public class Descuento {

    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Determinar si aplica descuento
        if (precio >= 100) {
            // Condición para verificar si el precio es mayor o igual a 100 y aplicar un descuento multiplicando por 0.9 (90%).
            double precioConDescuento = precio * 0.9; // Aplicar 10% de descuento
            System.out.println(
                "Se aplicó un descuento del 10%. Precio final: $" +
                precioConDescuento
            );
        } else {
            System.out.println("No aplica descuento. Precio final: $" + precio);
        }

        // Cerrar Scanner
        scanner.close();
    }
}
