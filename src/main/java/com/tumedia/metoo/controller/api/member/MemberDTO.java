package com.tumedia.metoo.controller.api.member;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
	private String stsDvcd; // 재학 상태
	private String regDate;
	
	


}
