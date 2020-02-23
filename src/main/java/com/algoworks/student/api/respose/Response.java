package com.algoworks.student.api.respose;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
@JsonPropertyOrder({"status_code","status","timestamp","result"})
public class Response<T> {

	private Boolean status;

	@JsonProperty("status_code")
	private Integer statusCode;

	private Result<T> result;
	
	private Long timestamp;

	public Response(T rsult,String message) {
		super();
		
		status=true;
		statusCode=200;
		timestamp = System.currentTimeMillis();
		result = new Result<T>(message,rsult);
 		
	}
	
	
	
}
