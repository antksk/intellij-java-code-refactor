package com.example.refactorings.method;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RenameTest {
    @RequiredArgsConstructor
    static final class A {
        private final int a;
        private final String b;

        int a(){
            return a;
        }
    }

    @Test
    @DisplayName("[Rename] class A를 사용하는 테스트 코드")
    void use() {
        int temp = 1;
        A test = new A(temp, "test");
        int a = test.a();
    }
}
