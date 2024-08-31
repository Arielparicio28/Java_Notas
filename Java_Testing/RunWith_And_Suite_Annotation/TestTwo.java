package RunWith_And_Suite_Annotation;


import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class TestTwo {
    String test = "Test two!";

    @Test
    public void test2() {
        assertEquals("Test two!",test);
    }
}
