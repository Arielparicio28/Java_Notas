package Child_Classes_in_Arrays_and_ArrayLists_POLIMORFISMO;

public class Main {
    public static void main(String[] args) {
        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        // Array de tipo Noodle llamada allTheNoodles
        Noodle [] allTheNoodles = {spaghetti,ramen,pho};
        /*Ejecuto el bulce for each para iterar en cada elemento del array anterior. */
        for(Noodle noodles: allTheNoodles){
            System.out.println(noodles.getCookPrep());

        }
    }
}
