package com.maximumofvariables;

public class MaximumOfVariables {

    public Float findMaxFloat(Float firstNumber,Float secondNumber,Float thirdNumber) {

        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
            return firstNumber;

        if (secondNumber.compareTo(thirdNumber) > 0)
            return secondNumber;

        return thirdNumber;
    }
}
