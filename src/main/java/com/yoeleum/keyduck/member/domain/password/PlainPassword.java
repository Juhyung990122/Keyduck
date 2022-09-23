package com.yoeleum.keyduck.member.domain.password;

public class PlainPassword {

    private static final int PASSWORD_MAX_LENGTH = 8;
    private String value;

    public PlainPassword(String value) {
        validatePasswordLength(value);
        this.value = value;
    }

    public MemberPassword encryptPassword(final Encoder encoder){
        return encoder.encode(value);
    }

    private void validatePasswordLength(final String value){
        if(value.length() > PASSWORD_MAX_LENGTH){
            throw new IllegalArgumentException("비밀번호 길이는 8자 이하로 제한됩니다.");
        }
    }
}
