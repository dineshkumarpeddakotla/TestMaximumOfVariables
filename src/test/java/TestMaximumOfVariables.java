import com.maximumofvariables.MaximumOfVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumOfVariables {

    @Test
    void GivenIntegerArray_MaxInteger_FirstPosition_ReturnsTrue() {
        MaximumOfVariables<Integer> testObj = new MaximumOfVariables<>(89,25 ,65 );
        Comparable<Integer> testMaximum = testObj.findMaxVariable(89, 25, 65);
        Assertions.assertEquals(89, testMaximum);
    }

    @Test
    void GivenIntegerArray_MaxInteger_SecondPosition_ReturnsTrue() {
        MaximumOfVariables<Integer> testObj = new MaximumOfVariables<>(25,89 ,65 );
        Comparable<Integer> testMaximum = testObj.findMaxVariable(25, 89, 65);
        Assertions.assertEquals(89, testMaximum);
    }

    @Test
    void GivenIntegerArray_MaxInteger_ThirdPosition_ReturnsTrue() {
        MaximumOfVariables<Integer> testObj = new MaximumOfVariables<>(25,65 ,89 );
        Comparable<Integer> testMaximum = testObj.findMaxVariable(25, 65, 89);
        Assertions.assertEquals(89, testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_FirstPosition_ReturnsTrue() {
        MaximumOfVariables<Float> testObj = new MaximumOfVariables<>(89.25f,25.85f ,65.69f );
        Comparable<Float> testMaximum = testObj.findMaxVariable(89.25f, 25.85f, 65.69f);
        Assertions.assertEquals(89.25f, testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_SecondPosition_ReturnsTrue() {
        MaximumOfVariables<Float> testObj = new MaximumOfVariables<>( 25.58f, 89.59f, 65.62f);
        Comparable<Float> testMaximum = testObj.findMaxVariable(25.58f, 89.59f, 65.62f);
        Assertions.assertEquals(89.59f, testMaximum);
    }

    @Test
    void GivenFloatArray_MaxFloat_ThirdPosition_ReturnsTrue() {
        MaximumOfVariables<Float> testObj = new MaximumOfVariables<>(25.56f, 65.95f, 89.85f);
        Comparable<Float> testMaximum = testObj.findMaxVariable(25.56f, 65.95f, 89.85f);
        Assertions.assertEquals(89.85f, testMaximum);
    }
    @Test
    void GivenStringArray_MaxString_FirstPosition_ReturnsTrue() {
        MaximumOfVariables<String> testObj = new MaximumOfVariables<>("Peach","Apple" ,"Banana" );
        Comparable<String> testMaximum = testObj.findMaxVariable("Peach", "Apple", "Banana");
        Assertions.assertEquals("Peach", testMaximum);
    }

    @Test
    void GivenStringArray_MaxString_SecondPosition_ReturnsTrue() {
        MaximumOfVariables<String> testObj = new MaximumOfVariables<>("Apple","Peach" ,"Banana" );
        Comparable<String> testMaximum = testObj.findMaxVariable("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", testMaximum);
    }

    @Test
    void GivenStringArray_MaxString_ThirdPosition_ReturnsTrue() {
        MaximumOfVariables<String> testObj = new MaximumOfVariables<>("Banana","Apple" ,"Peach");
        Comparable<String> testMaximum = testObj.findMaxVariable("Banana", "Apple", "Peach");
        Assertions.assertEquals("Peach", testMaximum);
    }
}

