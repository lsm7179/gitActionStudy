package com.example.hello.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("헬로 모듈에서 실행함")
public class HelloTest {

    @Test
    @DisplayName("hello")
    void name() {
        System.out.println("hell 모듈이에요");
        assertThat("hello").isNotNull();
    }
}
