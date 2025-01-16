import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {
        Scanner superscanner = new Scanner(System.in);

        System.out.println("Ingresa una palabra o texto: ");
        String valorIngresado = superscanner.nextLine();

        verificarNumero(valorIngresado);
        convertirCadenaANumero(valorIngresado);
        verificarSoloLetras(valorIngresado);

        superscanner.close();
    }

    public static void verificarNumero(String valorIngresado) {
        try {
            Double numero = Double.valueOf(valorIngresado);
            System.out.println("El valor ingresado es un numero válido!😀");
        } catch (Exception e) {
            System.out.println("El valor ingresado NO es un numero válido!☹️ ");
        }
    }

    public static void convertirCadenaANumero(String valorIngresado) {
        try {
            Integer numero = Integer.valueOf(valorIngresado);
            System.out.println(
                "El valor ingresado se ha convertido a número entero: " + numero
            );
        } catch (NumberFormatException e) {
            System.out.println(
                "El valor ingresado no es un número entero válido."
            );
        }
    }

    public static void verificarSoloLetras(String entrada) {
        boolean soloLetras = true;
        for (char c : entrada.toCharArray()) {
            if (!Character.isLetter(c)) {
                soloLetras = false;
                break;
            }
        }

        if (soloLetras) {
            System.out.println(
                "El valor ingresado contiene únicamente letras."
            );
        } else {
            System.out.println(
                "El valor ingresado contiene caracteres que no son letras."
            );
        }
    }
}
