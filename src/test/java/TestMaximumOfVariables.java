import com.maximumofvariables.MaximumOfVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumOfVariables {

    @Test
    void GivenIntegerArray_MaxInteger_ReturnsTrue() {
        MaximumOfVariables<Integer> testObj = new MaximumOfVariables<>(89, 25, 65,55,7);
        Comparable<Integer> testMaximum = testObj.findMaxVariable();
        Assertions.assertEquals(89, testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_ReturnsTrue() {
        MaximumOfVariables<Float> testObj = new MaximumOfVariables<>(89.25f,25.85f ,65.69f,25.68f,64.89f );
        Comparable<Float> testMaximum = testObj.findMaxVariable();
        Assertions.assertEquals(89.25f, testMaximum);
    }

    @Test
    void GivenStringArray_MaxString_ReturnsTrue() {
        MaximumOfVariables<String> testObj = new MaximumOfVariables<>("Apple","Peach" ,"Banana", "Grape","Mango");
        Comparable<String> testMaximum = testObj.findMaxVariable();
        Assertions.assertEquals("Peach", testMaximum);
    }
}

