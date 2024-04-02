    package activity1;

import activity1.elements.Calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n¡Bienvenido a la resolución del ejercicio 1 de esta Prueba de Validación!");
        System.out.println("\nEl primer método que creamos calcula la suma de los n primeros números enteros elevados " +
                           "a la segunda potencia.\nVeamos algunos ejemplos para comprobar su funcionamiento:");

        System.out.print("\n\tsumSquaredN(3)\n\t-> ");
        System.out.println(Calculator.sumSquaredN(3));

        System.out.print("\n\tsumSquaredN(6)\n\t-> ");
        System.out.println(Calculator.sumSquaredN(6));

        System.out.print("\n\tsumSquaredN(73)\n\t-> ");
        System.out.println(Calculator.sumSquaredN(73));

        System.out.println("\nA continuación, pondremos a prueba el segundo método que creamos, el cual ha de" +
                           "calcular la media de los números enteros comprendidos en el array que recibe como " +
                           "argumento:");

        System.out.print("\n\tmedia([10, 4, 6, 1, 7]) -> ");
        System.out.printf("%.2f", Calculator.media(new int[] {10, 4, 6, 1, 7}));

        System.out.print("\n\n\tmedia([10, 4, 6, 1, 7]) -> ");
        System.out.printf("%.2f", Calculator.media(new int[] {4, 7, 9, 2, 3, 7, 8}));

        System.out.println("\n\nEso ha sido todo... ¡Adiós!");
    }
}
