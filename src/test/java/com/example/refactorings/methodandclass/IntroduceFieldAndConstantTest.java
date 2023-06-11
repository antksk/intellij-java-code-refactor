package com.example.refactorings.methodandclass;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
class IntroduceFieldAndConstantTest {

    @Slf4j
    static final class A {
        private final B b;
        private int a;

        public A(B b) {
            this.b = b;
        }

        void biz(){
            int a = 10 + b.getB();
            log.debug("{}", a);
        }
    }

    @RequiredArgsConstructor
    static final class B {
        private final int b;
        int getB(){
            return b;
        }
    }

    @Test
    @DisplayName("[Introduce Field And Constant] class A가 B를 참조하며, A를 사용하는 테스트 코드")
    void use() {
        A a = new A(new B(10));
        a.biz();
    }

}
