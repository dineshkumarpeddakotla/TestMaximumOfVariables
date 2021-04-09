import com.maximumofvariables.MaximumOfVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumOfVariables {
    MaximumOfVariables testObj = new MaximumOfVariables();

    @Test
    void GivenFloatArray_MaxFloat_FirstPosition_ReturnsTrue() {
        float testMaximum = testObj.findMaxFloat(89.25f, 25.85f, 65.69f);
        Assertions.assertEquals(89.25f, testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_SecondPosition_ReturnsTrue() {
        float testMaximum = testObj.findMaxFloat(25.58f, 89.59f, 65.62f);
        Assertions.assertEquals(89.59f, testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_ThirdPosition_ReturnsTrue() {
        float testMaximum = testObj.findMaxFloat(25.56f, 65.95f, 89.85f);
        Assertions.assertEquals(89.85f, testMaximum);
    }
}

