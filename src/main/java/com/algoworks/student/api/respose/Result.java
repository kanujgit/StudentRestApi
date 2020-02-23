package com.algoworks.student.api.respose;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Result<T> {
	
	private String message;

	@JsonProperty("result")
	private T date;
	
	private Integer count;
	
	

}
