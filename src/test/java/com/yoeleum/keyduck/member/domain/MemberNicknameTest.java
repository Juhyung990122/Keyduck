package com.yoeleum.keyduck.member.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import com.yoeleum.keyduck.member.domain.password.PlainPassword;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberNicknameTest {

    @Test
    @DisplayName("닉네임을 검사하여 15자 이상이면 예외를 발생시킨다.")
    void validateNickNameLength(){
        assertThatThrownBy(() -> new MemberNickname("errorTestNicknameError"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("닉네임은 15자 이하로 제한됩니다.");
    }
}
