package com.sinbom.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.sinbom.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SinbomApplicationTest {

    @Autowired
    private Calculator calculator;

    @Test
    void contextLoads() {
        assertNotNull(calculator);
        assertEquals(2, calculator.plus(1, 1));
        assertEquals("sinbom", calculator.getName());
    }

}
