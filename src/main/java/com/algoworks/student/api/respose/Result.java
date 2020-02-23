package com.algoworks.student.api.respose;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Result<T> {

	private String message;

	@JsonProperty("data")
	private T data;

	private Integer count;

	public Result(String message, T data) {
		super();
		this.message = message;
		this.data = data;
	}

}
