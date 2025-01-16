import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClaseArray {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        Arrays.setAll(arr, i -> random.nextInt(100) + 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        /*for (int i = 0; i < arr.length / 2; i++) {
                    int temporal = arr[i];
                    arr[i] = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = temporal;
                }
                System.out.println(Arrays.toString(arr));         }*/
        Scanner superscanner = new Scanner(System.in);

        System.out.println(" Que valor quieres buscar? ");
        int busqueda = superscanner.nextInt();

        int indice = Arrays.binarySearch(arr, busqueda);

        //System.out.println(indice);

        if (indice >= 0) {
            System.out.println("Valor encontrado en el índice: " + indice);
        } else {
            System.out.println("Valor no encontrado en el array.");
        }

        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[10];
        Random random2 = new Random();
        Arrays.setAll(arr2, i -> random2.nextInt(100) + 1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        boolean compararArr = Arrays.equals(arr, arr2);

        if (compararArr) {
            System.out.println(" Los arrays son iguales ");
        } else {
            System.out.println(" Los arrays son diferentes ");
        }
    }
}
