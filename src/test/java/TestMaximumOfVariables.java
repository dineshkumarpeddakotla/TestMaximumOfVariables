import com.maximumofvariables.MaximumOfVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumOfVariables {

    MaximumOfVariables testObj = new MaximumOfVariables();

    @Test
    void GivenIntegerArray_MaxInteger_FirstPosition_ReturnsTrue() {
        int testMaximum = testObj.findMaxInteger(89, 25, 65);
        Assertions.assertEquals(89, testMaximum);
        }
}

