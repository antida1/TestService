package com.softland.TestService.model.dto;

public class ErrorDto {
	
	private String error;
	private String code;
	
	
	public ErrorDto() {
		super();
	}


	public ErrorDto(String error, String code) {
		super();
		this.error = error;
		this.code = code;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
