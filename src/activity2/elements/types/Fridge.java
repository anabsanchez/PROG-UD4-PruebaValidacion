package activity2.elements.types;

import activity2.elements.Gadget;

public class Fridge extends Gadget {

    private float temperature;

    public Fridge(String brand, String model, float weight, float power, float temperature) {

        super(brand, model, weight, power);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {

        if (super.isOn) {
            System.out.println("\t-> El electrodoméstico ya se encuentra encendido.\n");
            return;
        }

        super.isOn = true;
        System.out.println("\t-> ¡Ños, fuerte pelete!\n");
    }

    @Override
    public String toString() {

        return super.repeatChar('-', 50) +
                "\n* Tipo de electrodoméstico: Nevera" +
                super.toString() +
                "\n* Temperatura: " + this.temperature + "ºC" +
                "\n* Está encendido: " + (super.isOn ? "Sí" : "No") +
                super.repeatChar('-', 50);
    }
}
