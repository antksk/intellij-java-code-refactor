package com.example.refactorings.clazz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntroduceParameterObjectTest {

    private int foo(int a, String b, long c, char d){
        return 0;
    }

    @Test
    @DisplayName("[IntroduceParameterObject] foo함수를 사용하는 테스트 코드")
    void use() {
        foo(0, "", 0, 'c');
    }
}
