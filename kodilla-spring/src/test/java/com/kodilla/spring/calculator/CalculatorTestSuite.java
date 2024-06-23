package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations(){
       //Given
       //When
        calculator.add(3,4);
        calculator.sub(3,1);
        calculator.mul(6,2);
        calculator.div(6,2);
       //Then
        }
    }
