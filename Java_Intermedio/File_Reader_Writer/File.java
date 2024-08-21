package File_Reader_Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {
        //Write txt
        FileWriter output = new FileWriter("output.txt");
        String outputText = "Hola desde Java";
        output.write(outputText);
        output.close();
        //Read txt
        String path = "./File_Reader_Writer/input.txt";
        FileReader reader = new FileReader(path);
        int counter = 0;
        while ((counter = reader.read()) != -1) {
            System.out.print((char)counter);
        }
        reader.close();
    }
}
