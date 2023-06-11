package com.example.refactorings.methodandclass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ReplaceConstructorWithBuilderTest {
    static class A {
        private final int a;
        private final int b;
        private final int c;
        public A(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        static final class Builder {

        }
    }

    static class B {
        private int a = 1;
        private int b;

        public B(int a, int b) {
            this.a = a;
            this.b = b;
        }

        static final class Builder {

        }
    }

    @Test
    @DisplayName("[ReplaceConstructorWithBuilder] class A, B를 사용하는 테스트 코드")
    void use() {
        new A(1, 2, 3);
        new B(1, 2);
    }
}
