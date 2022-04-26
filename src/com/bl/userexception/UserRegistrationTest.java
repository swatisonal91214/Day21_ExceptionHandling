package com.bl.userexception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
	@Test
	public void checkvalidfname() {
		try {
			UserRegistration valid = new UserRegistration();
			valid.firstNameValid("Swati");
		}catch(UserRegisterationException userexception) {
		Assert.assertEquals("Enter Valid Fname", userexception.message);
	}

}
}
