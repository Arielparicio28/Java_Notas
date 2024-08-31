package Test_Methods_And_Asserts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestExample {
    Example ex = new Example();
    //assertEquals(expected, actual) ----- assertThat(actual, equalTo(expected));
    @Test
    public void testFactorial() {
        assertThat(ex.factorial(4), equalTo(24));
        assertThat(ex.factorial(5), equalTo(120));
        assertEquals(1,ex.factorial(1));
    }
}
