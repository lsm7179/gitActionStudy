package com.example.hello2.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("헬로2 모듈에서 실행함")
public class Hello2Test {

    @Test
    @DisplayName("hello2")
    void name() {
        System.out.println("hello2 모듈이에요.");
        assertThat("hello2").isNotNull();
    }
}
