package com.example.refactorings.method;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExtractMethodTest {

    @Getter
    @RequiredArgsConstructor(access = AccessLevel.PACKAGE)
    static final class B {
        private final int b;
        private final String c;
    }

    @RequiredArgsConstructor(access = AccessLevel.PACKAGE)
    static final class A {
        private final int a;
        String method(B b) {
            int result = a + b.getB();
            int d = a + result;
            return String.format("%d_%d : %s", result, d, List.of(a + b.getB(), a + result));
        }

    }

    @Test
    @DisplayName("[Extract Method] class A를 사용하는 테스트 코드")
    void use() {
        var test = new A(1);
        String result = test.method(new B(2, "test"));
        assertEquals("3_4 : [3, 4]", result);
    }
}
