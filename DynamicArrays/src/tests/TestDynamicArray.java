package tests;

public class TestDynamicArray {
    
import code.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDynamicArray extends Assertions {
    @Test
    public void test_resize_and_size(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(1);
        assertEquals(1, dynamicArray.capacity());
    }
}
    @Test
    public void test_set_and_get(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(1);
        dynamicArray.set(0, 5);
        assertEquals(5, dynamicArray.get(0));
    }
    @Test
    public void test_resize_exception(){
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.resize(-1));
    }

    @Test
    public void test_get_exception(){
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.get(-1));
        assertThrows(ArithmeticException.class, () -> dynamicArray.get(10));
    }

    @Test
    public void test_set_exception(){
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.set(-1, 5));
        assertThrows(ArithmeticException.class, () -> dynamicArray.set(10, 18));
    }

    @Test
    public void test_init_with_int(){
        DynamicArray dynamicArray = new DynamicArray(5);
        assertEquals(5, dynamicArray.capacity());
    }

    @Test
    public void test_init_without_correct_int(){
        DynamicArray dynamicArray = new DynamicArray(-5);
        assertEquals(10, dynamicArray.capacity());
    }


