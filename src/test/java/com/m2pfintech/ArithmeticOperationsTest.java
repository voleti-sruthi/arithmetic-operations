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

}
