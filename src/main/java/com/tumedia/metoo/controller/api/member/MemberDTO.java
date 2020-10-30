package com.tumedia.metoo.controller.api.member;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberDTO implements Serializable{

	private static final long serialVersionUID = -9111261151066330605L;
	
//	private int id;
	private String memberId;
	private String password;
	private String name;
	private String grade;
	private String gender;
	private String email;
	private String comName;
	private String deptNo;
	private String lecNo1;
	private String lecNo2;
	private String lecNo3;
	private String lecNo4;
	private String lecNo5;
	private String sts_dvcd; // 재학 상태
	private String regDate;
	
	
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
	public String getSts_dvcd() {
		return sts_dvcd;
	}
	public void setSts_dvcd(String sts_dvcd) {
		this.sts_dvcd = sts_dvcd;
	}

}
