package com.algoworks.student.api.respose;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"message","data","count"})
public class Result<T> {

	private String message;

	@JsonProperty("data")
	private T data;

	private Integer count;

	public Result(String message, T data) {
		super();
		this.message = message;
		this.data = data;
		
		if ( data instanceof List) {     // raw type
		    count =((List) data).size();
		}else {
			count =1;
		}
		
	}

	public Result() {
		super();
	}
	
	

}
