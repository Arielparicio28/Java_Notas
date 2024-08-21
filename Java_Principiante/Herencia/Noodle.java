package Herencia;

public class Noodle {

    double lengthInCentimeters;
    String shape;
    String texture = "brittle";

    public String cook() {

        this.texture = "cooked";

        return "Cocinando";
    }
}
