package ru.skypro.calculateTest.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.calculateTest.service.CalcatorService;

@Service

public class CalculatorServiceImpl implements CalcatorService {


    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
}
