package com.bl.exception;

public class DemoException {

	public String analyseMood(String msg) {
		try {
			if (msg.toLowerCase().contains("sad") || msg
					.toLowerCase().contains("exhausted")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (Exception e) {
			System.out.println("Invalid msg");
			System.out.println(e);
			e.printStackTrace();
			return "Invalid input";
		}
	}

	public void expression(int a, int b) {

		int add = 0, sub = 0, div = 0, mul = 0;

		
		  try { 
			  try {
		  
			  } catch (Exception e) { 
				  
			  } }
		  catch
		  	(ArithmeticException e) {
			  try {
		  
		  } catch (Exception e2) {  
			  
		  }
			  } catch
		  (NullPointerException e) { 
			  
		  }
		 

		try {
			add = a + b;
			sub = a - b;
			div = a / b;
			mul = a * b;

		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Addition result : " + add);
			System.out.println(
					"Sibstraction result : " + sub);
			System.out.println("Division result : " + div);
			System.out.println(
					"Multiplication result : " + mul);
		}
	}
}

