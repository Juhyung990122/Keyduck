package com.yoeleum.keyduck.member.domain.password;

@FunctionalInterface
public interface Matcher {

    boolean matches(final String inputPassword, final String memberPassword);
}
