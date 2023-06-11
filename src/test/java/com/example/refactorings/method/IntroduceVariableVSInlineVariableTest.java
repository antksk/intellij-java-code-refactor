package com.example.refactorings.method;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntroduceVariableVSInlineVariableTest {

    @RequiredArgsConstructor
    static final class A {
        private final int a;
        private final String b;
        int a() {
            return a;
        }
    }

    @Test
    @DisplayName("[Introduce Variable] class A를 사용하는 테스트 코드")
    void use() {
        new A(1, "test");
    }

    @Test
    @DisplayName("[Inline Variable] class A를 사용하는 테스트 코드")
    void use1() {
        String test = "test";
        A t1 = new A(1, test);
        A t2 = new A(2, test);
        A t3 = new A(3, test);
        A t4 = new A(4, test);

        List<A> list1 = List.of(t1, t2, t3, t4);
        List<A> list2 = List.of(t1, t4);
        List<A> list3 = List.of(t3, t4);
    }
}
