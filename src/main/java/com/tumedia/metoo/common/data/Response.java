package com.tumedia.metoo.common.data;

import lombok.Data;


/**
 * [공통] 응답 클래스
 * 
 * @author ximon
 * 
 * @param <T>
 */
@Data
public class Response<T> {
    private int statusCode;
    private String message;
    private T data;

    public Response() {}

    public Response(T data) {
        this.data = data;
    }

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
    
    
}