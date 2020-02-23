package com.algoworks.student.api.respose;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Response<T> {

	private Boolean status;

	@JsonProperty("status_code")
	private Integer statusCode;

	private String message;

	@JsonProperty("result")
	private T date;

	private Long timestamp;
	
	
}
