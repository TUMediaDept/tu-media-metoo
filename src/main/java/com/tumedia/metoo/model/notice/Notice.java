package com.tumedia.metoo.model.notice;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class Notice implements Serializable {
	
private static final long serialVersionUID = -7346858923123383239L;
	
	private int id;
	
	private String title;
	
	private String content;
	
	private String author;
	
	private String noticeDvcd;
	
	private String fixYn;
	
	private int viewCnt;
	
	private LocalDate regDate;
	
	
}