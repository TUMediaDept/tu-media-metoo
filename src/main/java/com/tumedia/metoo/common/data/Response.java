package com.tumedia.metoo.common.data;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * [공통] 응답 클래스
 * 
 * @author ximon
 * 
 * @param <T>
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response<T> {
	
    private int statusCode;
    private String message;
    private T data;


    public Response(T data) {
        this.data = data;
    }    
    
}