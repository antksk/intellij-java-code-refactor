package com.example.refactorings.clazz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoveInstanceMethodTest {

    class A {

        private int member;

        int getMember() {
            return member;
        }

        void a(B b){
            System.out.println(getMember());
        }
    }

    class B {

    }

    @Test
    @DisplayName("[MoveInstanceMethod] class A, B를 사용하는 테스트 코드")
    void use() {
        A a = new A();
        B b = new B();
        a.a(b);
    }
}
