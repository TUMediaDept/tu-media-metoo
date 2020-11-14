package com.tumedia.metoo.model.lecture;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class LectureEvaluation implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String title;  // 제목
	
	private String lecName;    // 강의명
	
	private String lecNo;
	
	private String author;
	
	private String pName;
	
	private String review;  // 후기
	
	private float lecRate;
	
	private LocalDate createdAt;
	
	private LocalDate updatedAt;

}
