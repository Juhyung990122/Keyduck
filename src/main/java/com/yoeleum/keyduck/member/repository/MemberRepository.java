package com.yoeleum.keyduck.member.repository;

import com.yoeleum.keyduck.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>{
}
