package Clases_Anidadas_Estaticas;

public class Main_1 {
    public static void main(String[] args){
        Toolbox.Saw petersSaw = new Toolbox.Saw();
        Toolbox.TapeMeasure amysMeasuringTape = new Toolbox.TapeMeasure();
        Toolbox.Wrench randomWrench = new Toolbox.Wrench();

        petersSaw.cut(); // output: Cutting...
        amysMeasuringTape.measure(); // output: Measuring...
        randomWrench.tighten(); // output: Tightening...
    }
}
