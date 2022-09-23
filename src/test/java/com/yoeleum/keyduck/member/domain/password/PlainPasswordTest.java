package com.yoeleum.keyduck.member.domain.password;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlainPasswordTest {

    @Test
    @DisplayName("패스워드의 길이를 검증하여 8자 이상이면 예외를 발생시킨다..")
    void validatePasswordLength() {

        assertThatThrownBy(() -> new PlainPassword("testtesttest"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("비밀번호 길이는 8자 이하로 제한됩니다.");
    }
}
