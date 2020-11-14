package com.tumedia.metoo.model.qna;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QnA implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private String content;
	private String questionDvcd;
	private String viewCnt;
	private String author;
	private String files;
	private LocalDate createdAt;
	private LocalDate updatedAt;

}
