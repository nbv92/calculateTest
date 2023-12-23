package ru.skypro.calculateTest.controller;

import org.springframework.web.bind.annotation.*;
import ru.skypro.calculateTest.service.CalcatorService;

@RestController
@RequestMapping("calculator")

public class CalculatorController {

    private final CalcatorService calcatorService;

    public CalculatorController(CalcatorService calcatorService) {
        this.calcatorService = calcatorService;
    }

    @GetMapping
    public String hi() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("plus")
    public String plus (
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Введите оба аргумента.";
        }
        return num1 + " + " + num2 + " = " + calcatorService.plus(num1, num2);
    }

    @GetMapping("minus")
    public String minus (@RequestParam(name = "num1", required = false) Integer num1,
                         @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Введите оба аргумента.";
        }
        return num1 + " - " + num2 + " = " + calcatorService.minus(num1, num2);
    }

    @GetMapping("multiply")
    public String multiply (@RequestParam(name = "num1", required = false) Integer num1,
                            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Введите оба аргумента.";
        }
        return num1 + " * " + num2 + " = " + calcatorService.multiply(num1, num2);
    }

    @GetMapping("divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer num1,
                         @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Введите оба аргумента.";
        }
        return num1 + " / " + num2 + " = " + calcatorService.divide(num1, num2);
    }
}
