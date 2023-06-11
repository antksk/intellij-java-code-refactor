package com.example.refactorings.clazz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExtractDelegateTest {
    static class A {
        public String foo(int a, String b, long c, char d) {
            return String.format("%d-%s-%d-%s", a, b, c, d);
        }

        static String staticFoo(int a, String b, long c, char d) {
            return String.format("%d-%s-%d-%s", a, b, c, d);
        }
    }

    @Test
    @DisplayName("[ExtractDelegate] class A를 사용하는 테스트 코드")
    void use() {
        A a = new A();
        a.foo(0, "b", 0, 'd');

        A.staticFoo(0, "b", 0, 'd');
    }

}
