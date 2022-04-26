package com.bl.userexception;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bl.original.UserRegistration;
import com.bl.original.UserRegistrationException;

@RunWith(Parameterized.class)
public class UserRegistrationParamTest {
	
	String actualResult;
	String ExpectedResult;
	UserRegistration userinput;
	public UserRegistrationParamTest(String actualResult,
			String expectedResult) {
		this.actualResult = actualResult;
		ExpectedResult = expectedResult;
	}
	
	public void init() {
		userinput = new UserRegistration();
	}
	
	@ParameterizedTest
	public Collection firstNameTest() {
		return Arrays.asList(new Object[][]{ {"Swati", "Valid"}, {" ", "EMPTY"}});
	}
	
	@Test
	public void testFName() throws UserRegisterationException {
		UserRegistration validator = new UserRegistration();
		String actualResult = null;
		try {
			actualResult = validator.fName(actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedResult = "valid";
		Assert.assertEquals(expectedResult, actualResult);
		
	}
	
	
	
	

}
