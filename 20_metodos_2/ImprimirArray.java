public class ImprimirArray {

    public static void main(String[] args) {
        // Ejemplo de uso de los métodos
        int[] arrayInt = { 1, 2, 3, 4, 5 };
        String[] arrayString = { "Hola", "Mundo", "Java" };
        int[][] arrayBidimensionalInt = { { 1, 2, 3 }, { 4, 5, 6 } };
        String[][] arrayBidimensionalString = {
            { "Uno", "Dos" },
            { "Tres", "Cuatro" },
        };

        System.out.println("Array de enteros:");
        imprimirArray(arrayInt);

        System.out.println("\nArray de Strings:");
        imprimirArray(arrayString);

        System.out.println("\nArray bidimensional de enteros:");
        imprimirArray(arrayBidimensionalInt);

        System.out.println("\nArray bidimensional de Strings:");
        imprimirArray(arrayBidimensionalString);
    }

    // Método para imprimir un array de enteros
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Nueva línea al final
    }

    // Sobrecarga para imprimir un array de Strings
    public static void imprimirArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println(); // Nueva línea al final
    }

    // Sobrecarga para imprimir un array bidimensional de enteros
    public static void imprimirArray(int[][] array) {
        for (int[] fila : array) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println(); // Nueva línea al final de cada fila
        }
    }

    // Sobrecarga para imprimir un array bidimensional de Strings
    public static void imprimirArray(String[][] array) {
        for (String[] fila : array) {
            for (String str : fila) {
                System.out.print(str + " ");
            }
            System.out.println(); // Nueva línea al final de cada fila
        }
    }
}
/*

La sobrecarga de métodos (method overloading) es una característica en Java,
permite definir múltiples métodos con el mismo nombre pero con diferentes parámetros.
Aquí un ejemplo completo:

```java
public class EjemploSobrecarga {
    // Método para sumar dos números enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga para sumar tres números enteros
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga para sumar dos números decimales
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Sobrecarga para concatenar dos strings
    public static String sumar(String a, String b) {
        return a + b;
    }

Reglas importantes:
    1. El tipo de retorno NO puede ser el único elemento diferenciador
    ```java
    // Esto NO es válido
    public int metodo(int a) { return a; }
    public double metodo(int a) { return a; } // Error de compilación
    ```

    2. Los nombres de los parámetros NO son diferenciadores
    ```java
    // Esto NO es válido
    public void metodo(int x) { }
    public void metodo(int y) { } // Error de compilación
    ```

Beneficios de la sobrecarga:
    1. Mayor flexibilidad en el uso de métodos
    2. Código más limpio y legible
    3. Diferentes opciones para el mismo comportamiento básico
    4. Mejora la reutilización del código
*/
/*
Un arreglo bidimensional es una estructura de datos que se puede visualizar como una tabla o matriz con filas y columnas. En Java, se puede crear de dos formas:

```java
// Forma 1: Declaración y creación en una línea
int[][] matriz = new int[3][4]; // Crea una matriz de 3 filas y 4 columnas

// Forma 2: Declaración con valores iniciales
int[][] matriz = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

Ejemplo práctico:

```java
public class EjemploMatriz {
    public static void main(String[] args) {
        // Crear una matriz 3x3
        int[][] matriz = new int[3][3];

        // Llenar la matriz
        int valor = 1;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Imprimir la matriz
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Nueva línea al final de cada fila
        }
    }
}
```

Este código produciría:
```
1    2    3
4    5    6
7    8    9
```

Características importantes:
1. Se accede a los elementos usando dos índices: `matriz[fila][columna]`
2. El primer índice representa la fila
3. El segundo índice representa la columna
4. Los índices comienzan en 0
5. Se puede usar bucles anidados para recorrer la matriz

Ejemplo de uso real:
```java
public class TableroAjedrez {
    public static void main(String[] args) {
        String[][] tablero = new String[8][8];

        // Llenar el tablero
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if((i + j) % 2 == 0) {
                    tablero[i][j] = "■"; // Casilla negra
                } else {
                    tablero[i][j] = "□"; // Casilla blanca
                }
            }
        }

        // Imprimir el tablero
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

Este código crearía una representación visual de un tablero de ajedrez:
```
■ □ ■ □ ■ □ ■ □
□ ■ □ ■ □ ■ □ ■
■ □ ■ □ ■ □ ■ □
□ ■ □ ■ □ ■ □ ■
■ □ ■ □ ■ □ ■ □
□ ■ □ ■ □ ■ □ ■
■ □ ■ □ ■ □ ■ □
□ ■ □ ■ □ ■ □ ■
```

Los arreglos bidimensionales son útiles para:
- Representar tableros de juegos
- Manejar datos tabulares
- Procesar imágenes (cada píxel como un elemento)
- Matrices matemáticas
- Mapas o grillas en juegos
*/
