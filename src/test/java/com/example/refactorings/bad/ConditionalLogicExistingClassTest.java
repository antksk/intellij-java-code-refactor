package com.example.refactorings.bad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionalLogicExistingClassTest {

    @Test
    @DisplayName("[ConditionalLogicExistingClass] calculateInsurance 계산 결과 확인 테스트 코드")
    void calculateInsurance() {
        var calculator = new ConditionalLogicExistingClass();
        assertEquals(1_825, calculator.calculateInsurance(5_000), "low");
        assertEquals(38_600, calculator.calculateInsurance(25_000), "medium");
        assertEquals(78_500, calculator.calculateInsurance(50_000), "high");
        assertEquals(106_400, calculator.calculateInsurance(100_000), "very high");
    }
}