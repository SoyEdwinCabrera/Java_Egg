import java.util.Scanner;

public class Buscador {

    public static void main(String args[]) {
        int[] numero = { 2, 8, 5 };
        System.out.println("Ingrese un numero");

        Scanner input = new Scanner(System.in);
        int numUsuario = input.nextInt();

        if (
            numero[0] == numUsuario ||
            numero[1] == numUsuario ||
            numero[2] == numUsuario
        ) {
            System.out.println("El numero esta presente en el array");
        } else {
            System.out.println("El numero no esta presente");
        }
        input.close();
    }
}
