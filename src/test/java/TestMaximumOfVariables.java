import com.maximumofvariables.MaximumOfVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumOfVariables {
    MaximumOfVariables testObj = new MaximumOfVariables();

    @Test
    void GivenIntegerArray_MaxInteger_FirstPosition_ReturnsTrue() {
        Comparable testMaximum = testObj.findMaxVariable(89, 25, 65);
        Assertions.assertEquals(89, testMaximum);
    }

    @Test
    void GivenIntegerArray_MaxInteger_SecondPosition_ReturnsTrue() {
        Comparable testMaximum = testObj.findMaxVariable(25, 89, 65);
        Assertions.assertEquals(89, testMaximum);
    }

    @Test
    void GivenIntegerArray_MaxInteger_ThirdPosition_ReturnsTrue() {
        Comparable testMaximum = testObj.findMaxVariable(25, 65, 89);
        Assertions.assertEquals(89, testMaximum);
    }
    @Test
    void GivenFloatArray_MaxFloat_FirstPosition_ReturnsTrue() {
        Comparable testMaximum = testObj.findMaxVariable("Peach", "Apple", "Banana");
        Assertions.assertEquals("Peach", testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_SecondPosition_ReturnsTrue() {
        Comparable testMaximum = testObj.findMaxVariable("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_ThirdPosition_ReturnsTrue() {
        Comparable testMaximum = testObj.findMaxVariable("Banana", "Apple", "Peach");
        Assertions.assertEquals("Peach", testMaximum);
    }
}

