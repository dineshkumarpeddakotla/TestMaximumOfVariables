package com.maximumofvariables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximumOfVariables <E extends Comparable<E>> {

    E firstVariable, secondVariable, thirdVariable, fourthVariable, fifthVariable;

    public MaximumOfVariables(E firstVariable, E secondVariable, E thirdVariable, E fourthVariable, E fifthVariable){
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
        this.fourthVariable = fourthVariable;
        this.fifthVariable = fifthVariable;
    }

    public static <E extends Comparable<E>>  E multipleVariable(E firstVariable,E secondVariable,E thirdVariable,E fourthVariable, E fifthVariable) {

        List<E> variableList = new ArrayList<>();
        variableList.add(firstVariable);
        variableList.add(secondVariable);
        variableList.add(thirdVariable);
        variableList.add(fourthVariable);
        variableList.add(fifthVariable);

        variableList.sort(Comparator.naturalOrder());
        return variableList.get(4);
    }

    public  E findMaxVariable(){
        return MaximumOfVariables.multipleVariable(firstVariable,secondVariable,thirdVariable,fourthVariable,fifthVariable);
    }

}
