import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner superscanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        int opcion;

        do {
            System.out.println(
                """
                    Menú de opciones:

                1. Registrar alumno
                2. Mostrar todos los alumnos
                3. Mostrar promedio de notas
                4. Buscar alumno por nombre
                5. Modificar nota por nombre
                6. Eliminar alumno por nombre
                7. Salir

                Seleccione una opción: """
            );

            opcion = superscanner.nextInt();
            superscanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarAlumno(superscanner, nombres, notas);
                    break;
                case 2:
                    mostrarAlumnos(nombres, notas);
                    break;
                case 3:
                    mostrarPromedioNotas(notas);
                    break;
                case 4:
                    buscarAlumno(superscanner, nombres, notas);
                    break;
                case 5:
                    modificarNota(superscanner, nombres, notas);
                    break;
                case 6:
                    eliminarAlumno(superscanner, nombres, notas);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);

        superscanner.close();
    }

    private static void registrarAlumno(
        Scanner superscanner,
        ArrayList<String> nombres,
        ArrayList<Double> notas
    ) {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = superscanner.nextLine();
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }

        System.out.print("Ingrese la nota del alumno (0.00 - 10.00): ");
        try {
            double nota = Double.parseDouble(superscanner.nextLine());
            if (nota < 0.0 || nota > 10.0) {
                System.out.println("La nota debe estar entre 0.00 y 10.00.");
                return;
            }

            nombres.add(nombre);
            notas.add(nota);
            System.out.println("Alumno registrado exitosamente.");
        } catch (NumberFormatException e) {
            System.out.println(
                "Entrada inválida. Debe ingresar un número para la nota."
            );
        }
    }

    private static void mostrarAlumnos(
        ArrayList<String> nombres,
        ArrayList<Double> notas
    ) {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.println("Lista de alumnos:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(
                "Nombre: " + nombres.get(i) + ", Nota: " + notas.get(i)
            );
        }
    }

    private static void mostrarPromedioNotas(ArrayList<Double> notas) {
        if (notas.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        double suma = 0.0;
        for (Double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.size();
        System.out.println("El promedio de notas es: " + promedio);
    }

    private static void buscarAlumno(
        Scanner superscanner,
        ArrayList<String> nombres,
        ArrayList<Double> notas
    ) {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombre = superscanner.nextLine();
        int index = nombres.indexOf(nombre);

        if (index != -1) {
            System.out.println("Nota de " + nombre + ": " + notas.get(index));
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void modificarNota(
        Scanner superscanner,
        ArrayList<String> nombres,
        ArrayList<Double> notas
    ) {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a modificar: ");
        String nombre = superscanner.nextLine();
        int index = nombres.indexOf(nombre);

        if (index != -1) {
            System.out.print("Ingrese la nueva nota (0.00 - 10.00): ");
            try {
                double nuevaNota = Double.parseDouble(superscanner.nextLine());
                if (nuevaNota < 0.0 || nuevaNota > 10.0) {
                    System.out.println(
                        "La nota debe estar entre 0.00 y 10.00."
                    );
                    return;
                }
                notas.set(index, nuevaNota);
                System.out.println("Nota modificada exitosamente.");
            } catch (NumberFormatException e) {
                System.out.println(
                    "Entrada inválida. Debe ingresar un número para la nota."
                );
            }
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void eliminarAlumno(
        Scanner superscanner,
        ArrayList<String> nombres,
        ArrayList<Double> notas
    ) {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a eliminar: ");
        String nombre = superscanner.nextLine();
        int index = nombres.indexOf(nombre);

        if (index != -1) {
            nombres.remove(index);
            notas.remove(index);
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}
