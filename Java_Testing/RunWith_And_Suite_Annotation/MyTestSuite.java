package RunWith_And_Suite_Annotation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestOne.class,
        TestTwo.class
})

public class MyTestSuite {
}