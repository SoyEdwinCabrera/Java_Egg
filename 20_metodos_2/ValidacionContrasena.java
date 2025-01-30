import java.util.Scanner;

public class ValidacionContrasena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        if (esSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }

    // Método que verifica si la contraseña es segura
    public static boolean esSegura(String contrasena) {
        return (
            tieneLongitudCorrecta(contrasena) &&
            tieneMayuscula(contrasena) &&
            tieneMinuscula(contrasena) &&
            tieneNumero(contrasena) &&
            tieneCaracterEspecial(contrasena)
        );
    }

    // Verifica si la contraseña tiene al menos 8 caracteres
    public static boolean tieneLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    // Verifica si la contraseña tiene al menos una letra mayúscula
    public static boolean tieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña tiene al menos una letra minúscula
    public static boolean tieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña tiene al menos un número
    public static boolean tieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña tiene al menos un carácter especial
    public static boolean tieneCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}
/*
Explicación del código:

Método main:
    Se solicita al usuario que ingrese una contraseña.
    Se llama al método esSegura(contrasena) para verificar si la contraseña es segura
    y se imprime el resultado.

Método esSegura(String contrasena):
    Este método utiliza los métodos auxiliares para comprobar si la contraseña cumple
    con todos los criterios de seguridad. Devuelve true si todos los criterios son cumplidos, y false en caso contrario.

Métodos auxiliares:
    tieneLongitudCorrecta(String contrasena): Verifica que la longitud
    de la contraseña sea al menos 8 caracteres.
    tieneMayuscula(String contrasena): Recorre la contraseña y verifica
    si hay al menos una letra mayúscula.
    tieneMinuscula(String contrasena): Recorre la contraseña y verifica
    si hay al menos una letra minúscula.
    tieneNumero(String contrasena): Recorre la contraseña y verifica
    si hay al menos un número.
    tieneCaracterEspecial(String contrasena): Recorre la contraseña y verifica
    si hay al menos un carácter especial, utilizando una cadena que contiene
    los caracteres especiales permitidos.

    Este código proporciona una validación completa de la contraseña según
    los criterios establecidos y muestra un mensaje adecuado al usuario.
*/
