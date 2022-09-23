package com.yoeleum.keyduck.member.domain;

import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
public class MemberNickname {

    private static final int NICKNAME_MAX_LENGTH = 15;
    private String value;

    public MemberNickname(final String value) {
        validateMemberNickname(value);
        this.value = value;
    }

    private void validateMemberNickname(final String value){
        if(value.length() > NICKNAME_MAX_LENGTH){
            throw new IllegalArgumentException("닉네임은 15자 이하로 제한됩니다.");
        }
    }
}
