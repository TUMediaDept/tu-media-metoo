package com.tumedia.metoo.common.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseMessage {
	
	private StatusEnum status;
	
	private String message;
	
	private Object data;
}
