package com.tumedia.metoo.model.member;

import java.io.Serializable;

import lombok.Data;

@Data
public class Member implements Serializable {

	private static final long serialVersionUID = -7346858923123383239L;
	
	public static final String ANDORID = "1";
	public static final String IOS = "2";
	
//	private int id;
	private String memberId;			// id(학번)
	private String password;			// 비밀번호
	private String name;				// 성명(실명 권장)
	private String grade;				// 학년 (1,2,3,4)
	private String gender;				// 성별 (1: 남자, 2:여자) 
	private String email;				// 이메일
	private String comName;				// 대학코드
	private String deptNo;				// 학과코드
	private String lecNo;				// 과목번호 (?? TODO:필요 여부 확인)
	private String lecNo1;				// 수강과목1
	private String lecNo2;				// 수강과목2
	private String lecNo3;				// 수강과목3
	private String lecNo4;				// 수강과목4
	private String lecNo5;				// 수강과목5
	private String regDate;				// 생성일
	
	public Member() {
		
	}

	/*
	 * lombok을 활용하여,
	 * @Data 어노테이션 활용 시 getter & setter
	 * 생략 가능하다고 알고있었으나 적용되지 않는다....
	 * 
	 * TODO: 추후에 getter setter 생략 가능한 방법 찾아볼 것
	 *  -> 코드는 가독성과 간단/명료 할수록 clean code  
	 */
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getLecNo() {
		return lecNo;
	}

	public void setLecNo(String lecNo) {
		this.lecNo = lecNo;
	}

	public String getLecNo1() {
		return lecNo1;
	}

	public void setLecNo1(String lecNo1) {
		this.lecNo1 = lecNo1;
	}

	public String getLecNo2() {
		return lecNo2;
	}

	public void setLecNo2(String lecNo2) {
		this.lecNo2 = lecNo2;
	}

	public String getLecNo3() {
		return lecNo3;
	}

	public void setLecNo3(String lecNo3) {
		this.lecNo3 = lecNo3;
	}

	public String getLecNo4() {
		return lecNo4;
	}

	public void setLecNo4(String lecNo4) {
		this.lecNo4 = lecNo4;
	}

	public String getLecNo5() {
		return lecNo5;
	}

	public void setLecNo5(String lecNo5) {
		this.lecNo5 = lecNo5;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
}
