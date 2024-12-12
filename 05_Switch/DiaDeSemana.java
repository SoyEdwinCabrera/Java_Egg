import java.util.Scanner;

public class DiaDeSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Ingrese un número del 1 al 7 para representar un día de la semana:"
        );
        int numeroDia = scanner.nextInt();

        String nombreDia;
        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número inválido. Ingrese un número del 1 al 7.";
                break;
        }
        System.out.println(
            "El día correspondiente al número ingresado es: " + nombreDia
        );

        scanner.close();
    }
}
