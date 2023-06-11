package com.example.refactorings.method;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ExtractFieldTest {

    @RequiredArgsConstructor(access = AccessLevel.PACKAGE)
    static final class A {
        private final int a;
        private final String b;

        public String format() {
            return String.format("%s_%d", b, a);
        }
    }

    @Test
    @DisplayName("[Extract Field] class A를 사용하는 테스트 코드")
    void use() {
        var test = new A(1, "test");
        assertTrue("test_1".equals(test.format()));
    }

}
