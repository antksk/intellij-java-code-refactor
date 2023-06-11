package com.example.refactorings.method;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.refactorings.method.IntroduceParameterTest.A.generateText;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class IntroduceParameterTest {

    @RequiredArgsConstructor
    static final class A {
        static String generateText(String message) {
            return String.format("%s %s", message.toUpperCase(), "World");
        }
    }

    @Test
    @DisplayName("[IntroduceParameter] class A를 사용하는 테스트 코드")
    void use() {
        log.debug("{}", generateText("Hello"));
    }
}
