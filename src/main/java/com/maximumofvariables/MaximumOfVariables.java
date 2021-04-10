package com.maximumofvariables;

public class MaximumOfVariables <E extends Comparable<E>> {

    E firstVariable, secondVariable, thirdVariable;

    public MaximumOfVariables(E firstVariable, E secondVariable, E thirdVarible){
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVarible;

    }

    public E findMaxVariable(E firstVariable,E secondVariable,E thirdVariable) {

        if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
            return firstVariable;

        if (secondVariable.compareTo(thirdVariable) > 0)
            return secondVariable;

        return thirdVariable;
    }
}
