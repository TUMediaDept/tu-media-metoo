package com.tumedia.metoo.model.member;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {

	private static final long serialVersionUID = -7346858923123383239L;
	
	public static final String ANDORID = "1";
	public static final String IOS = "2";
	// lombok 적용 완
//	private int id;
	private String memberId;			// id(학번)
	private String password;			// 비밀번호
	private String name;				// 성명(실명 권장)
	private String grade;				// 학년 (1,2,3,4)
	private String gender;				// 성별 (1: 남자, 2:여자) 
	private String email;				// 이메일
	private String comName;				// 대학코드
	private String deptNo;				// 학과코드
	private String lecNo1;				// 수강과목1
	private String lecNo2;				// 수강과목2
	private String lecNo3;				// 수강과목3
	private String lecNo4;				// 수강과목4
	private String lecNo5;				// 수강과목5
	private String sts_dvcd;			// 재학 상태 (1. 재학 2. 휴학 3. 졸업 4. 기
	private String regDate;				// 생성일

	
	
}
