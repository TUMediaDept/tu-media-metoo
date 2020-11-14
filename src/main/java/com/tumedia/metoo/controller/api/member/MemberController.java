package com.tumedia.metoo.controller.api.member;

import java.nio.charset.Charset;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumedia.metoo.common.data.ResponseMessage;
import com.tumedia.metoo.common.data.StatusEnum;
import com.tumedia.metoo.model.member.Member;
import com.tumedia.metoo.service.member.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class MemberController {

	@Autowired
	private MemberService memberService;

	// 회원 가입
	@PostMapping("/member")
	public ResponseEntity<ResponseMessage> insertMember(@Valid @ModelAttribute Member member,
			BindingResult bindingResult, HttpServletRequest request, HttpServletResponse response) {

		// 회원 가입 결과 : 1. 성공 0. 실패
		boolean insertResult = memberService.insertMember(member);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();

		if (insertResult = true) {
			rms.setData(insertResult);
			rms.setMessage("회원가입 성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(insertResult);
			rms.setMessage("회원가입 실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}

		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}

	// 회원 전체 조회
	@GetMapping("/member")
	public ResponseEntity<ResponseMessage> findAllMember(@ModelAttribute Member member){

		
		List<Member> memberList = memberService.findAllMember();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();

		if (memberList != null) {
			rms.setData(memberList);
			rms.setMessage("회원 전체 조회 성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(memberList);
			rms.setMessage("회원 전체 조회 실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}

		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}

	// 회원 상세 조회
	@GetMapping("/member/{id}")
	public ResponseEntity<ResponseMessage> findMemberDetailById(@PathVariable int id){

		//회원 가입 결과 : 1. 성공  0. 실패
		Member memberDetail = memberService.findMemberDetailById(id);		
		HttpHeaders headers = new HttpHeaders();	
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();

	if (memberDetail != null) {
		rms.setData(memberDetail);
		rms.setMessage("회원 전체 조회 성공");
		rms.setStatus(StatusEnum.OK);
	} else {
		rms.setData(memberDetail);
		rms.setMessage("회원 전체 조회 실패");
		rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
	}

	return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}

}
