package Try_Catch_Exception;
import java.io.FileReader;
import java.io.IOException;
public class Exception {
        public static void main(String[] args) {
            String path = "/a/bad/file/path/to/thisFile.txt";
            try {
                FileReader reader = new FileReader(path);
                while (reader.ready()) {
                    System.out.print((char) reader.read());
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Hay una IO Exception!");
                System.out.println(e);
            }
        }
    }

