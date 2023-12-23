package ru.skypro.calculateTest.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.calculateTest.exception.DivisionByZeroException;
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
        if(num2 == 0 ) {
            throw new DivisionByZeroException ("Деление на ноль запрещено всеми, везде, и всюду. Министерство развития предлагает вам купить вам учебник математики в любом отделении почты россии. Телефон 000 - 00 - 0. С заботой о вас и о вашем настроении. ");
        }
        return (double) num1 / num2;
    }
}
