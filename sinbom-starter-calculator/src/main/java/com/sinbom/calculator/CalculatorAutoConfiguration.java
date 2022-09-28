package com.sinbom.calculator;

import static org.springframework.util.StringUtils.hasText;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@RequiredArgsConstructor
@EnableConfigurationProperties(value = CalculatorProperties.class)
public class CalculatorAutoConfiguration {

    private final CalculatorProperties calculatorProperties;

    @Bean
    public Calculator calculator() {
        String name = hasText(calculatorProperties.getName()) ?
            calculatorProperties.getName() : "default";

        return new Calculator(name);
    }

}
