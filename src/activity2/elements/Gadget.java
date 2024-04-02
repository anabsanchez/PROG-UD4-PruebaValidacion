package activity2.elements;

public class Gadget {

    protected String brand;
    protected String model;
    protected float weight;
    protected float power;
    protected boolean isOn;

    public Gadget(String brand, String model, float weight, float power) {

        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.power = power;
        this.isOn = false;
    }

    public String getBrand() {

        return this.brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getModel() {

        return this.model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public float getWeight() {

        return this.weight;
    }

    public void setWeight(float weight) {

        this.weight = weight;
    }

    public float getPower() {

        return this.power;
    }

    public void setPower(float power) {

        this.power = power;
    }

    public void turnOn() {

        if (this.isOn) {
            System.out.println("El electrodoméstico ya se encuentra encendido.");
            return;
        }

        this.isOn = true;
    }

    public void turnOff() {

        if (!this.isOn) {
            System.out.println("El electrodoméstico ya se encuentra apagado.");
            return;
        }

        this.isOn = false;
    }

    @Override
    public String toString() {

        return "\n* Marca: " + this.brand +
               "\n* Modelo: " + this.model +
               "\n* Peso: " + this.weight + "kg" +
               "\n* Potencia: " + this.power + "kW";

    }

    protected static StringBuilder repeatChar(char c, int n) {

        StringBuilder stringBuilder = new StringBuilder("\n");

        stringBuilder.append(String.valueOf(c).repeat(Math.max(0, n)));

        return stringBuilder;
    }
}
