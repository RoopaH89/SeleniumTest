package com.programs;

public class Java_Reverse_a_Number {

	/**
	 * 
	 * 
	 * Reverse a number
	 *Example:
	 *Iteration1: 
		number = 1234
		remainder = 1234 % 10 = 4
		reverse = 0 * 10 + 4 = 0 + 4 = 4
		number = 1234 / 10 = 123
		
		Iteration2:
		number = 123
		remainder = 123 % 10 = 3
		reverse = 4 * 10 + 3 = 40 + 3 = 43
		number = 123 / 10 = 12
		
		Iteration3:
		number = 12
		remainder = 12 % 10 = 2
		reverse = 43 * 10 + 2 = 430 + 2 = 432
		number = 12 / 10 = 1
		
		Iteration4:
		number = 1
		remainder = 1 % 10 = 1
		reverse = 432 * 10 + 1 = 4320 + 1 = 4321
		number = 1 / 10 = 0
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		int num1=10005, reminder=0,reverse=0;
		
			//Method1 : Using While loop
					
			while(num1!=0)	
			{
				reminder=num1%10;
				reverse=(reverse*10)+reminder;
				num1=num1/10;
			}
			
				System.out.println("The reverse of the given number is: " + reverse);  
			
				
			//Method 2: Using for loop
				
			for(;num1!=0;num1=num1/10)
			{
				reminder=num1%10;
				reverse=(reverse*10)+reminder;
			}
			System.out.println("The reverse of the given number is: " + reverse);  

}
}

