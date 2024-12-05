package clase_1;

public class clase1 {

    public static void main(String[] args) {
        System.out.println("Hola Amigos");

        // 1. Crea un programa que imprima "Bienvenido a tu curso de Java" en la consola.
        System.out.println("Bienvenido a tu curso de Java");

        // 2. Crea un programa que imprima "Mi nombre es [colocaAquiTuNombre]" en la consola.
        String nombre = "Edwin";
        System.out.println("Mi nombre es " + nombre);

        // 3. Crea un programa que imprima "Mi edad es 35"
        int miEdad = 35;
        System.out.println("Mi edad es " + miEdad);

        /*
        4. Declara una variable por cada uno de los siguientes tipos de dato, asignando un
        valor (nombre y valor de tu preferencia):
        a. boolean
        b. char
        c. String
        d. Int
        e. long
        f. float
        */
        boolean esEstudiante = true;
        char inicialApellido = 'G';
        String nombreCompleto = "Juan Pérez";
        int año = 1988;
        long numeroCompleto = 1234567890L;
        float altura = 1.75f;

        /*
        5. Imprime en consola el contenido de al menos tres de las variables que declaraste en el paso anterior
        */
        System.out.println("Valor de la variable boolean; " + esEstudiante);
        System.out.println("Valor de la variable char; " + inicialApellido);
        System.out.println("Valor de la variable String; " + nombreCompleto);
        System.out.println("Valor de la variable int; " + año);
        System.out.println("Valor de la variable long; " + numeroCompleto);
        System.out.println("Valor de la variable float; " + altura);

        /*
        6. Declara una nueva variable para almacenar tu edad y otra para almacenar tu
        nombre e imprimir en pantalla en texto que diga "Mi nombre es [nombre], y tengo [edad] años".
        */
        System.out.println(
            "Mi nombre es " + nombre + ", y tengo " + miEdad + " años"
        );
    }
}
