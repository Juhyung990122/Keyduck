package com.yoeleum.keyduck.member.service;

import com.yoeleum.keyduck.member.domain.Member;
import com.yoeleum.keyduck.member.domain.password.PlainPassword;
import com.yoeleum.keyduck.member.domain.password.MemberPassword;
import com.yoeleum.keyduck.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;

    public void save(String password) {
//        final PlainPassword plainPassword = new PlainPassword(password);
//        final MemberPassword encryptedPassword
//                = plainPassword.encryptPassword((rawPassword) -> new MemberPassword(passwordEncoder.encode(rawPassword)));
    }

    public void login(String email, String password){
//        Member member = memberRepository.findByEmail(email);
//        final boolean match = member.checkPassword(passwordEncoder::matches, password);
//        if (match) {
//            // 토큰 발급~
//        }
    }
}
