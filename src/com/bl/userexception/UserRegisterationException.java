package com.bl.userexception;

public class UserRegisterationException extends Throwable{
	public ExceptionType exceptionType;
	public String  message;
	
	public enum ExceptionType{
		EMPTY,NULL,INVALID;
	}

	public UserRegisterationException(
			ExceptionType exceptionType, String message) {
		this.exceptionType = exceptionType;
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserRegisterationException [exceptionType="
				+ exceptionType + ", message=" + message
				+ "]";
	}
	
	
	
	

}
