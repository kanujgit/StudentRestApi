package com.algoworks.student.api.respose;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;



@Data
@JsonPropertyOrder({"status_code","status","timestamp","result"})
public class Response<T> {

	private Boolean status;

	@JsonProperty("status_code")
	private Integer statusCode;

	private Result<T> result;
	
	private Long timestamp;

	
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
	public Response(T rsult,String message) {
		super();
		
		status=true;
		statusCode=200;
		timestamp = System.currentTimeMillis();
		result = new Result<T>(message,rsult);
 		
	}
	
	/*{
	status_code:
	status:
	timeStamp:
	result: {
			message:
			}
	}*/

	public Response(String message) {
		super();
		//result = new Result<T>(message);
		status=true;
		statusCode=200;
		timestamp = System.currentTimeMillis();
		result = new Result<T>(message);
	}
	
	/*{
	status_code:
	status:
	timeStamp:
	result: {
			message:
			}
	}*/
	
	public Response(String message,int statusCode) {
		super();
		//result = new Result<T>(message);
		status=true;
		this.statusCode=statusCode;
		timestamp = System.currentTimeMillis();
		result = new Result<T>(message);
	}
	
	
	
	
	
	
}
