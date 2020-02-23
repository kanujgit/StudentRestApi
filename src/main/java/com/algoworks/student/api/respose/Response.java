package com.algoworks.student.api.respose;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


/*{
status_code:
status:
timeStamp:
result: {
		message:
		data:{}/[]
		count:
		}
}*/
@Data
public class Response<T> {

	private Boolean status;

	@JsonProperty("status_code")
	private Integer statusCode;

	@JsonProperty("result")
	private Result<T> result;

	private Long timestamp;

	public Response(T rsult,String message) {
		super();
		
		status=true;
		statusCode=200;
		timestamp = System.currentTimeMillis();
		this.result = new Result<T>(message,(T) result);
 		
	}
	
	
	
}
