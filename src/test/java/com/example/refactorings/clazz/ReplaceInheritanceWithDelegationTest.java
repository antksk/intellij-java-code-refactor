package com.example.refactorings.clazz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReplaceInheritanceWithDelegationTest {
    class A {
        public void a(){
        }
    }

    class B extends A {
    }

    @Test
    @DisplayName("[ReplaceInheritanceWithDelegation] class A를 사용하는 테스트 코드")
    void use() {
        A a = new B();
        a.a();

        B b = new B();
        b.a();
    }
}
