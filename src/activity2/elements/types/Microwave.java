package activity2.elements.types;

import activity2.elements.Gadget;

public class Microwave extends Gadget {

    private boolean isOpen;

    public Microwave(String brand, String model, float weight, float power) {

        super(brand, model, weight, power);
        this.isOpen = false;
    }

    @Override
    public void turnOn() {

        if (super.isOn) {
            System.out.println("\t-> El electrodoméstico ya se encuentra encendido.\n");
            return;
        }

        if (this.isOpen) {
            System.out.println("\t-> Error: Debe cerrar la puerta del microondas para encenderlo.\n");
            return;
        }

        super.isOn = true;
        System.out.println("\t-> Algo huele a quemado...");
    }

    @Override
    public String toString() {

        return super.repeatChar('-', 50) +
                "\n* Tipo de electrodoméstico: Microondas" +
                super.toString() +
                "\n* Puerta: " + (this.isOpen ? "Abierta" : "Cerrada") +
                "\n* Está encendido: " + (super.isOn ? "Sí" : "No") +
                super.repeatChar('-', 50);
    }
}
