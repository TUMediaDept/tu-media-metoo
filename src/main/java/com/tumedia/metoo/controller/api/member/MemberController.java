package com.tumedia.metoo.controller.api.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumedia.metoo.dao.member.MemberDAO;

import com.tumedia.metoo.common.data.Response;
import com.tumedia.metoo.controller.api.member.MemberDTO;
import com.tumedia.metoo.model.member.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/member")
public class MemberController {

	@Autowired
	private MemberDAO memberDAO;

	// 회원가입
	@PostMapping("/signup")
	public Response<Member> signUp(
			@Valid @ModelAttribute MemberDTO memberDTO,
//			@RequestBody MemberDTO memberDTO,
								   BindingResult result,
								   HttpServletRequest request, 
								   HttpServletResponse response) {

		Response<Member> res = new Response<>();

		Member member = new Member();
		member.setMemberId(memberDTO.getMemberId());
		
//		Member record = memberDAO.selectOneMember(member); // 회원 단건 조회
		Member record = null;

		if (record == null) {
			// 신규 회원가입
			member = new Member();
			member.setMemberId(memberDTO.getMemberId());
			member.setPassword(memberDTO.getPassword());
			member.setName(memberDTO.getName());
			member.setGrade(memberDTO.getGrade());
			member.setGender(memberDTO.getGender());
			member.setEmail(memberDTO.getEmail());
			member.setComName(memberDTO.getComName());
			member.setDeptNo(memberDTO.getDeptNo());
			member.setLecNo1(memberDTO.getLecNo1());
			member.setLecNo2(memberDTO.getLecNo2());
			member.setLecNo3(memberDTO.getLecNo3());
			member.setLecNo4(memberDTO.getLecNo4());
			member.setLecNo5(memberDTO.getLecNo5());
			member.setSts_dvcd(memberDTO.getSts_dvcd());
			memberDAO.signUp(member);
			res.setData(member);
		} else {
			// 탈퇴 회원 재가입 (회원탈퇴 기능 현재 계획에 없음)
		}
//		member.setMemberId("1111");
//		member.setPassword("2222");
//		member.setName("테스트계정");
//		member.setGrade("1");
//		member.setGender("1");
//		member.setEmail("test@test.test");
//		member.setComName("공과대학");
//		member.setDeptNo("11");
//		member.setLecNo("999");
//		member.setLecNo1("101");
//		member.setLecNo2("202");
//		member.setLecNo3("303");
//		member.setLecNo4("404");
//		member.setLecNo5("505");
//		memberDAO.signUp(member);
//		res.setData(member);
		return res;
	}
}
