package com.bl.exception;

public class TryCatchDemo {
	
	public static void main(String[] args) {
		int add= 0;
		int sub = 0;
		int div = 0;
		int mul = 0;
		int a = 10;
		int b= 0;
		
			 add = a + b;
			 sub = a - b;
			 mul = a * b;
			 try {                       
				 div = a / b;
				 }catch (ArithmeticException e) {
				System.out.println(e);	
				e.printStackTrace();
				}
				
			 
//			 try {
//				 System.out.println("Inside outer loop");
//				 
//				 try {
//					 System.out.println("Inside middle loop ");
//					 try {
//						 System.out.println("Inside inner loop");
//					 }catch(Exception e){
//						 System.out.println("Inside inner catch");
//					 }
//				 }catch(Exception e2) {
//					 System.out.println("Inside middle catch");
//				 }
//			 }catch(Exception e3) {
//					System.out.println("Inside outer catch"); 
//				 }
			
			 
//			 try {          -> 1 try multiple catch
//				 div = a/b;
//			 } catch(ArithmeticException e ) {
//				 System.out.println(e);
//			 }catch(Exception e) {
//				 System.out.println("You are in the second catch!! You have got some error");
//			 }
			 
			 
			 
//		try {                        -> 2 try 1 catch
//			 div = a / b;
//			 
//			 try {
//				 div = b/a;
//			 }
//		 catch (ArithmeticException e) {
//			System.out.println(e);
//			//System.out.println(e.printStackTrace(PrintStream s));
//		}
//		}
		
		
		finally {
			System.out.println("Addition result : " + add);
			System.out.println(
					"Substraction result : " + sub);
			System.out.println("Division result : " + div);
			System.out.println(
					"Multiplication result : " + mul);
		}
	}
}
		
	


