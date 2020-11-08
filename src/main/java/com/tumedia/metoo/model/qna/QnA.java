package com.tumedia.metoo.model.qna;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QnA {
	
	public static final String ANDORID = "1";
	public static final String IOS = "2";
	
	
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
