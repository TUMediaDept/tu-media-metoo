package com.tumedia.metoo.service.member;

import java.util.List;

import com.tumedia.metoo.model.member.Member;

public interface MemberService {
	
	// 회원 가입
	boolean insertMember(Member member);
	
	// 전체 회원 조회
	List<Member> findAllMember();
	
	// 회원 상세 조회
	Member findMemberDetailById(int id);

}
