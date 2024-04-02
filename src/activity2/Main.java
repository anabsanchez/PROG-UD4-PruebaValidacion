package activity2;

import activity2.elements.types.Fridge;
import activity2.elements.types.Microwave;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n¡Bienvenido a la resolución del ejercicio 2 de esta Prueba de Validación!");

        System.out.print("\nEste es nuestro nuevo electrodoméstico: ");
        Fridge fridge = new Fridge("Samsung", "S400-PRO", 300, 100, 6);
        System.out.println(fridge);

        System.out.println("¡Encendámoslo!");
        fridge.turnOn();

        System.out.print("Veamos si algo ha cambiado en su estado...");
        System.out.println(fridge);

        System.out.println("¡Genial! Podemos volverlo a apagar de momento.");
        fridge.turnOff();

        System.out.print("\nObtengamos un nuevo electrodoméstico, que en algo hay que gastar el dinerico y provoca algo calientito =D");
        Microwave microwave = new Microwave("Xiaomi", "Mi-982fX", 15, 45);
        System.out.println(microwave);

        System.out.println("Viene apagado por defecto, así que toca encenderlo también: ");
        microwave.turnOn();
        System.out.println(microwave);
        System.out.println("Parece que todo funciona correctamente, podemos apagarlo ya...");
        microwave.turnOff();
        System.out.println(microwave);

        System.out.println("¡Hasta luego!");
    }
}
