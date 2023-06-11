package com.example.refactorings.methodandclass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MakeStaticTest {

    static final class A {
        String format(int a, String b) {
            return String.format("%s_%d", b, a);
        }
    }

    @DisplayName("[MakeStatic] class A를 사용하는 테스트 코드")
    @Test
    void makeStatic() {
        var test = new A();

        assertTrue("test_1".equals(test.format(1, "test")));
        assertTrue("test_2".equals(test.format(2, "test")));
        assertTrue("test_3".equals(test.format(3, "test")));
        assertTrue("test_4".equals(test.format(4, "test")));
    }

}
