package ru.skypro.calculateTest.exception;

public class DivisionByZeroException extends IllegalArgumentException {

    public DivisionByZeroException(String s) {
        super(s);
    }

}
