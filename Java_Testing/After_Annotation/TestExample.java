package After_Annotation;

// Test imports
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
// File imports
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
// Possible exceptions to detect
import java.io.IOException;

public class TestExample {

    @Test
    public void test1() throws IOException {
        File file = new File("test.txt");
        FileWriter w = new FileWriter("test.txt");

        w.write("Testing testing 1 2 3!");
        w.close();

        Scanner s = new Scanner(file);
        assertThat(s.nextLine(), equalTo("Testing testing 1 2 3!"));
        s.close();
    }

    @Test
    public void test2() throws IOException {
        File file = new File("test.txt");
        FileWriter w = new FileWriter("test.txt");

        w.write("Poking poking 4 5 6!");
        w.close();

        Scanner s = new Scanner(file);
        assertThat(s.nextLine(), equalTo("Poking poking 4 5 6!"));
        s.close();
    }
}
