package ru.skypro.calculateTest.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.skypro.calculateTest.exception.DivisionByZeroException;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    public void testSumCorrectly() {

        //given
        int num1 = 10, num2 = 20;
        int expectedResult = num1 + num2;

        //when
        int actualResult = calculatorService.plus(num1,num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinusCorrectly() {

        //given
        int num1 = 10, num2 = 20;
        int expectedResult = num1 - num2;

        //when
        int actualResult = calculatorService.minus(num1,num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testMultiplyCorrectly() {

        //given
        int num1 = 10, num2 = 20;
        int expectedResult = num1 * num2;

        //when
        int actualResult = calculatorService.multiply(num1,num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testDivideCorrectly() {

        //given
        int num1 = 10, num2 = 20;
        double expectedResult = (double)  num1 / num2;

        //when
        double actualResult = calculatorService.divide(num1,num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testDivideCorrectlyOnZero() {

        //given
        int num1 = 10, num2 = 0;
        //when
        //then
        Assertions.assertThrows(
                DivisionByZeroException.class,
                () -> {
                    calculatorService.divide(num1,num2);
                }
        );

    }
}
