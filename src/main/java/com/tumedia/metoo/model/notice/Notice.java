package com.tumedia.metoo.model.notice;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice implements Serializable {
	
private static final long serialVersionUID = -7346858923123383239L;
	
	public static final String ANDORID = "1";
	public static final String IOS = "2";
	
	private int id;
	private String title;
	private String content;
	private String noticeDvcd;
	private String isFixed;
	private int viewCnt;
	private LocalDate regDate;
	
	
}