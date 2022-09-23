package com.yoeleum.keyduck.member.domain;

import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
public class MemberEmail {

    private String value;

    public MemberEmail(final String value) {
        this.value = value;
    }

}
