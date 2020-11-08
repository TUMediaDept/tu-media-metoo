package com.tumedia.metoo.controller.api.member;

import java.nio.charset.Charset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@PostMapping("/member")
	public ResponseEntity<ResponseMessage> insertMember(@ModelAttribute Member member
															){
		
		// 회원 가입 결과 : 1. 성공  0. 실패
		boolean result = memberService.insertMember(member);
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application","json",Charset.forName("UTF-8")));
		
		ResponseMessage rms = new ResponseMessage();
		
		if(result = true) {
			rms.setData(result);
			rms.setMessage("회원가입 성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(result);
			rms.setMessage("회원가입 실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}
		

		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}
	
}
