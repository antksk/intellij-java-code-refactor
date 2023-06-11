package com.example.refactorings.methodandclass;

import org.junit.jupiter.api.Test;

class ReplaceConstructorWithFactoryMethodTest {
    static class A {
        private final int a;

        public A(int a) {
            this.a = a;
        }
    }


    @Test
    void use() {
        new A(0);
    }
}
