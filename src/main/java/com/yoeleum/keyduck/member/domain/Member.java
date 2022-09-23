package com.yoeleum.keyduck.member.domain;

import com.yoeleum.keyduck.member.domain.password.Matcher;
import com.yoeleum.keyduck.member.domain.password.MemberPassword;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private MemberNickname nickname;
    @Embedded
    private MemberEmail email;
    @Embedded
    private MemberPassword password;
    private MemberType memberType;
    private ActivityStatus status;

    public boolean checkPassword(final Matcher matcher, final String inputPassword){
        return password.matches(matcher, inputPassword);
    }

    public Member update(final Member sourceEntity) {
        this.nickname = sourceEntity.getNickname();
        this.password = sourceEntity.getPassword();
        return this;
    }
}
