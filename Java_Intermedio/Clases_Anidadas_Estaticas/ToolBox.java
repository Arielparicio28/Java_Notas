package Clases_Anidadas_Estaticas;

class Toolbox{
    public static String toolboxName = "Awesome Toolbox";
    public String ownerName;

    static class Saw{
        public void cut(){
            System.out.println("Cutting...");
        }
    }

    static class TapeMeasure{
        public void measure(){
            System.out.println("Measuring...");
        }
    }

    static class Wrench{
        public void tighten(){
            System.out.println("Tightening...");
        }

        public void loosen(){
            System.out.println("Loosening...");
        }
    }
}
