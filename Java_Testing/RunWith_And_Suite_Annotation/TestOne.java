package RunWith_And_Suite_Annotation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestOne {
    String test = "Test one!";

    @Test
    public void test2() {
        assertThat(test, equalTo("Test one!"));
    }
}