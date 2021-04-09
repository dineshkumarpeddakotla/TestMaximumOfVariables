package com.maximumofvariables;

public class MaximumOfVariables {

    public Integer findMaxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
            return firstNumber;

        if (secondNumber.compareTo(thirdNumber) > 0)
            return secondNumber;

        return thirdNumber;
    }
}
