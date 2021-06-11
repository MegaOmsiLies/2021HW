package testing.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.code.MyClass;

public class MyClassTest extends Assertions {
    @Test
    public void firstTestP()
    {
        MyClass myClass = new MyClass();

        int result = myClass.add(10);

        assertEquals(10, result);
    }

}
