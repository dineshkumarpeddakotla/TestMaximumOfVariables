package com.maximumofvariables;

public class MaximumOfVariables <E extends Comparable<E>> {

    public E findMaxVariable(E firstVariable,E secondVariable,E thirdVariable) {

        if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
            return firstVariable;

        if (secondVariable.compareTo(thirdVariable) > 0)
            return secondVariable;

        return thirdVariable;
    }
}
