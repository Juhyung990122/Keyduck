package com.yoeleum.keyduck.member.domain.password;

import com.yoeleum.keyduck.member.domain.password.Matcher;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
public class MemberPassword {

    private String value;

    public MemberPassword(final String value) {
        this.value = value;
    }

    public boolean matches(final Matcher matcher, final String inputPassword){
        return matcher.matches(inputPassword, value);
    }
}
