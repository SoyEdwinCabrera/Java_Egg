import java.util.Scanner;

public class BusquedaCaracter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese una palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        // Solicitar al usuario que ingrese un carácter
        System.out.print("Ingresa un carácter: ");
        char caracter = scanner.next().charAt(0); // Leemos el primer carácter ingresado

        // Verificar si el carácter se encuentra en la palabra utilizando indexOf()

        int indice = palabra.indexOf(caracter);
        // Mostrar el resultado en pantalla
        String mensaje = (indice != -1)
            ? "El carácter '" + caracter + "' se encuentra en la palabra."
            : "El carácter '" + caracter + "' no se encuentra en la palabra.";
        System.out.println(mensaje);
        scanner.close();
    }
}
