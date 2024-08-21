package Herencia_keyword_protected;

public class Noodle {
    //Private es para indicarle ala variable que solo esta disponible para esta clase.
    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;

    /*Protected le indica a la variable q esta disponible para otras clases q herenden de noodle
    pero no esta disponible globalmente.*/
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }
//Uso final para que este metodo no se pueda cambiar en ninguna clase hijo de noodle.
    public final boolean isTasty() {
        return true;
    }
}
