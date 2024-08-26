package Final_Project;
@FunctionalInterface

public interface IntUserInputRetriever <T>{

   T produceOutputOnIntUserInput(int selection) throws IllegalArgumentException;


}
