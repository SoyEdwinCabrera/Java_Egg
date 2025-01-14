public class CicloFor {

    public static void main(String[] args) {
        int[] superarray = { 10, 20, 30, 40, 50 };
        imprimirElementos(superarray);
        //valorMinimo(superarray);
        //invertirArray(superarray);
        invertirArrayAlmacenado(superarray);
        imprimirElementos(superarray);
    }

    public static void imprimirElementos(int[] superarray) {
        System.out.println("Elementos del Superarray: ");
        for (int paco = 0; paco < superarray.length; paco++) {
            System.out.println(superarray[paco]);
        }
    }

    public static void valorMinimo(int[] superarray) {
        System.out.println("El valor minimo en le superarray es: ");
        int minimo = superarray[0];
        for (int hugo = 1; hugo < superarray.length; hugo++) {
            if (superarray[hugo] < minimo) {
                minimo = superarray[hugo];
            }
        }
        System.out.println(minimo);
    }

    public static void invertirArray(int[] superarray) {
        System.out.println("El array invertido es: ");
        int longitudArray = superarray.length;
        for (int luis = longitudArray - 1; luis >= 0; luis--) {
            System.out.println(superarray[luis]);
        }
    }

    public static void invertirArrayAlmacenado(int[] superarray) {
        System.out.println("Superarray con elementos invertidos: ");
        int len = superarray.length;

        for (int carlos = 0; carlos < len / 2; carlos++) {
            int temporal = superarray[carlos];
            superarray[carlos] = superarray[len - 1 - carlos];
            superarray[len - 1 - carlos] = temporal;
        }
        for (int index = 0; index < len; index++) {
            System.out.println(superarray[index]);
        }
    }
}
