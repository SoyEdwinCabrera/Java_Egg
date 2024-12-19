import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPasswordValid = false;

        while (!isPasswordValid) {
            System.out.print("Ingrese su contraseña: ");
            String password = scanner.nextLine();

            boolean hasMinLength = password.length() >= 8;
            boolean hasUppercase = password.matches(".*[A-Z].*");
            boolean hasLowercase = password.matches(".*[a-z].*");
            boolean hasNumber = password.matches(".*[0-9].*");
            boolean hasSpecialChar = password.matches(".*[@!#$%^&*(),.?\":{}|<>].*");

            if (hasMinLength && hasUppercase && hasLowercase && hasNumber && hasSpecialChar) {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
                isPasswordValid = true;
            } else {
                System.out.print("Contraseña no segura. ");
                if (!hasMinLength) {
                    System.out.print("Debe tener al menos 8 caracteres. ");
                }
                if (!hasUppercase) {
                    System.out.print("Debe contener al menos una letra mayúscula. ");
                }
                if (!hasLowercase) {
                    System.out.print("Debe contener al menos una letra minúscula. ");
                }
                if (!hasNumber) {
                    System.out.print("Debe contener al menos un número. ");
                }
                if (!hasSpecialChar) {
                    System.out.print("Debe contener al menos un carácter especial. ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
