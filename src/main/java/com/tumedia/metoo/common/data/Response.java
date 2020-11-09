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

	
}