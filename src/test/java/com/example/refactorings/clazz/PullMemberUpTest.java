package com.example.refactorings.clazz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PullMemberUpTest {

    static class A {
    }

    static class B extends A{
        void b(){
        }

        void a(){
        }
    }

    @Test
    @DisplayName("[PullMemberUp] class A, B를 사용하는 테스트 코드")
    void use() {
        B b = new B();
        b.a();
        b.b();
    }
}
