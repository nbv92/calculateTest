package ru.skypro.calculateTest.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalcalatorServiceImplParamTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> provideNumbersForCalculator() {
        return Stream.of(
                Arguments.of(10,20),
                Arguments.of(0,20),
                Arguments.of(10,1),
                Arguments.of(100,2)
        );

    }
    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void testSumCorrectly(int num1, int num2) {

        //given
        int expectedResult = num1 + num2;

        //when
        int actualResult = calculatorService.plus(num1,num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void testMinusCorrectly(int num1, int num2) {

        //given
        int expectedResult = num1 - num2;

        //when
        int actualResult = calculatorService.minus(num1,num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void testMultiplyCorrectly(int num1, int num2) {

        //given
        int expectedResult = num1 * num2;

        //when
        int actualResult = calculatorService.multiply(num1,num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void testDivideCorrectly(int num1, int num2) {

        //given
        double expectedResult = (double) num1 / num2;

        //when
        double actualResult = calculatorService.divide(num1,num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
