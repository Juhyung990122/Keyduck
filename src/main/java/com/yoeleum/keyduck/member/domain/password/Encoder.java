package com.yoeleum.keyduck.member.domain.password;

@FunctionalInterface
public interface Encoder {

    MemberPassword encode(String plainPassword);
}
