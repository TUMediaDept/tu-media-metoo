package com.tumedia.metoo.service.member;

import com.tumedia.metoo.model.member.Member;

public interface MemberService {
	
	// 회원 가입
	boolean insertMember(Member member);
}
