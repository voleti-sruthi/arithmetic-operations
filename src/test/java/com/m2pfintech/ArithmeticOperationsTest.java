package com.m2pfintech;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {
    ArithmeticOperations arithmeticOperationsObject = new ArithmeticOperations();
    @Test
    void toReturnSixteenWhenSevenIsAddedToNine(){

        int expectedValue = 16;

        int actualValue = arithmeticOperationsObject.add(7,9);

        assertEquals(expectedValue,actualValue);

    }
    @Test
    void toReturnTwoWhenSevenIsSubtractedToNine(){

        int expectedValue = 2;

        int actualValue = arithmeticOperationsObject.subtract(9,7);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void toReturnMinusTwoWhenNineIsSubtractedToSeven(){

        int expectedValue = -2;

        int actualValue = arithmeticOperationsObject.subtract(7,9);

        assertEquals(expectedValue,actualValue);

    }


}
