package com.tumedia.metoo.common;

/**
 * [공통] 공통 기틍 유틸 클래
 * 
 * @author ximon
 * 
 */
public class CommonUtil {

	public static int doAdd(int num1, int num2) {
		return num1+num2;
	}
	public static int doAdd(int num1, String num2) {
		int parseNum2;
		parseNum2 = Integer.parseInt(num2);
		
		return num1 + parseNum2;
	}
}
