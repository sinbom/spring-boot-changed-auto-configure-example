package com.sinbom.calculator;

import lombok.Getter;

@Getter
public class Calculator {

    private final String name;

    public Calculator(String name) {
        this.name = name;
    }

    public int plus(int a, int b) {
        return a + b;
    }

}
