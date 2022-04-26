package com.bl.userexception;

public class UserRegistration {
	
	public String VALID_NAME = "^[A-Z]{1}[a-zA-Z]{2}$";
	
	public String firstNameValid(String firstName) throws UserRegisterationException{
		try {
			if(firstName.length()== 0) {
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.EMPTY, "Enter Valid Fname");
			}
			if(firstName.matches(VALID_NAME)) {
				return "Valid";
				
			}else {
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID, "Enter valid name");
				
			}
		}catch(NullPointerException exception) {
			throw new NullPointerException(exception.getMessage());
		}
	}

}
