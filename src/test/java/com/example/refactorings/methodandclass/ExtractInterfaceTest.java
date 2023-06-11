package com.example.refactorings.methodandclass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExtractInterfaceTest {
    static class A {
        public static final double CONSTANT = 3.14;
        private final int a;
        public A(int a) {
            this.a = a;
        }

        public int a() {
            return a;
        }

        public void secretMethod() {
        }

        public void publicMethod() {
        }
    }

    @Test
    @DisplayName("[ExtractInterface] class A를 사용하는 첫번째 테스트 코드")
    void use() {
        A a = new A(0);
        var temp = a.a();
        var c = A.CONSTANT;
        a.publicMethod();
    }

    @Test
    @DisplayName("[ExtractInterface] class A를 사용하는 두번째 테스트 코드")
    void use2() {
        A a = new A(0);
        var temp = a.a();
        var c = A.CONSTANT;
        a.secretMethod();
    }

}
