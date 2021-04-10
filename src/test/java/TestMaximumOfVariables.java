import com.maximumofvariables.MaximumOfVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumOfVariables {
    MaximumOfVariables testObj = new MaximumOfVariables();

    @Test
    void GivenFloatArray_MaxFloat_FirstPosition_ReturnsTrue() {
        String testMaximum = testObj.findMaxString("Peach", "Apple", "Banana");
        Assertions.assertEquals("Peach", testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_SecondPosition_ReturnsTrue() {
        String testMaximum = testObj.findMaxString("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_ThirdPosition_ReturnsTrue() {
        String testMaximum = testObj.findMaxString("Banana", "Apple", "Peach");
        Assertions.assertEquals("Peach", testMaximum);
    }
}

