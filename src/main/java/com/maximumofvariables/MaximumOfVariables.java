package com.maximumofvariables;

public class MaximumOfVariables {

    public String findMaxString(String firstString, String secondString, String thirdString) {

        if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0)
            return firstString;

        if (secondString.compareTo(thirdString) > 0)
            return secondString;

        return thirdString;
    }
}
