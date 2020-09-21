package com.dxc.movie.entity;

import io.swagger.annotations.ApiModelProperty;

public class ErrorResponse {
	@ApiModelProperty(notes = "Error Code", name = "code", value = "404")
	private int code;

	@ApiModelProperty(notes = "Error Status", name = "status", value = "NOT FOUND")

	private String status;
	@ApiModelProperty(notes = "Error Message", name = "message", value = "profile not found")

	private String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorResponse [code=" + code + ", status=" + status + ", message=" + message + "]";
	}
	
}
