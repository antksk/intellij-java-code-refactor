package com.example.refactorings.clazz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PushMemberDownTest {

    static class A {
        public void a(){

        }
    }

    static class B extends A{

    }

    @Test
    @DisplayName("[PushMemberDown] class A, B를 사용하는 테스트 코드")
    void use() {
        A a = new A();
        a.a();

        B b = new B();
        b.a();
    }
}
