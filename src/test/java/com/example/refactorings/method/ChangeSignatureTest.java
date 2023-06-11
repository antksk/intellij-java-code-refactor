package com.example.refactorings.method;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
class ChangeSignatureTest {

    @RequiredArgsConstructor(access = AccessLevel.PACKAGE)
    static final class A {
        private final String name;
        private String generateText(String message) {
            return String.format("%s%s%s %s", "[", message.toUpperCase(), "]", name);
        }
    }

    @Test
    @DisplayName("[ChangeSignature] class A를 사용하는 첫번째 테스트 코드")
    void use() {
        String temp1 = "test";
        int temp = 0;

        var test = new A("tester");
        log.debug("{}", test.generateText("hello"));
        log.debug("{}", test.generateText("hi"));
        log.debug("{}", test.generateText("안녕하세요"));
    }

    @Test
    @DisplayName("[ChangeSignature] class A를 사용하는 두번째 테스트 코드")
    void use2() {
        String temp1 = "test";
        int temp2 = 0;

        var test = new A("tester");
        log.debug("{}", test.generateText("hello"));
        log.debug("{}", test.generateText("hi"));
        log.debug("{}", test.generateText("안녕하세요"));
    }

    @Test
    @DisplayName("[ChangeSignature] class A를 사용하는 세번째 테스트 코드")
    void use3() {
        String temp1 = "test";
        int temp2 = 0;
        int temp3 = temp2 + 3;

        var test = new A("tester");
        log.debug("{}", test.generateText("hello"));
        log.debug("{}", test.generateText("hi"));
        log.debug("{}", test.generateText("안녕하세요"));
    }

}
