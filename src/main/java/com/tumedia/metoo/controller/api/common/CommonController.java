package com.tumedia.metoo.controller.api.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumedia.metoo.common.data.Response;
import com.tumedia.metoo.dao.member.MemberDAO;

import lombok.RequiredArgsConstructor;

/**
 * 공통 기능 컨트롤러(회원가입, 로그인, 초기데이터 등)
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CommonController {
	
	@Autowired
	private MemberDAO memberDAO;

	
	// 초기데이터
	@PostMapping("/data")
	public Response<Map<String, Object>> data() {
		//TODO: 초기데이터 설계 및 생성
		HashMap<String, Object> param = new HashMap<>();

		return new Response(param);
	}
	// 세션 생성
	
	// 세션 정보 받아오
	
	
	// 2020-10-26 김창환 이부분 수정합니다.
	// [START]pull request test
	
	// ~!@!@#@!$~#
	//~!#@$@!~$~@#2`
	//`1@#~!$~!#!@#
	// ~!@!@#@!$~#
	//~!#@$@!~$~@#2`
	//`1@#~!$~!#!@#
	// ~!@!@#@!$~#
	//~!#@$@!~$~@#2`
	//`1@#~!$~!#!@#
	
	// [END]pull request test
	
	
}
