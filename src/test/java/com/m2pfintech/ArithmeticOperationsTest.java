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
    void toReturnTwoWhenSevenIsSubtractedFromNine(){

        int expectedValue = 2;

        int actualValue = arithmeticOperationsObject.subtract(9,7);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void toReturnMinusTwoWhenNineIsSubtractedFromSeven(){

        int expectedValue = -2;

        int actualValue = arithmeticOperationsObject.subtract(7,9);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void toReturnSixtyThreeWhenNineIsMultipliedWithSeven(){

        long expectedValue = 63;

        long actualValue = arithmeticOperationsObject.multiply(7,9);

        assertEquals(expectedValue,actualValue);

    }
    @Test
    void toReturnSixtyThreeWhenMinusNineIsMultipliedWithMinusSeven(){

        long expectedValue = 63;

        long actualValue = arithmeticOperationsObject.multiply(-7,-9);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void toReturnMinusSixtyThreeWhenMinusNineIsMultipliedWithSeven(){

        long expectedValue = -63;

        long actualValue = arithmeticOperationsObject.multiply(7,-9);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void toReturnZeroWhenNineIsMultipliedWithZero(){

        long expectedValue = 0;

        long actualValue = arithmeticOperationsObject.multiply(0,9);

        assertEquals(expectedValue,actualValue);

    }


}
