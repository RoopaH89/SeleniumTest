package com.programs;

import java.util.Scanner;

public class LearnSet_count_vowels_cons_digits_spl {

	public static void main(String[] args) 
	{
		String str=" ";
		char ch='\0';
		int vowels=0,consonants=0,digits=0,spl_Char=0;
		
		//Get the String from the User
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter String :: ");
	    str = scan.nextLine();

		
		//convert the string to Upper case
		str=str.toUpperCase();
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			//Check if the character is an alphabet
			if(ch>='A' && ch <='Z')
			{
				if (checkVowel(ch))
				{
					vowels=vowels+1;
				}
				else
				{
					consonants=consonants+1;

				}

			}
			//check if the entered character is a digit
			else if(ch>='0' && ch<='9')
			{
				digits=digits+1;
			}
			
			else
			{
				spl_Char=spl_Char+1;

			}
		}
		System.out.println("No of Vowels entered:" + vowels+ "\n"+
				           "No of Consonants entered:" + consonants +"\n"+
				           "No of Digits entered:" + digits +"\n"+
				           "No of special characters entered:" +spl_Char);

		
	}
	
	private static boolean checkVowel(char ch) {
	      if(ch == 'A' || ch == 'E' || ch == 'I'
	            || ch == 'O' || ch == 'U')
	      return true;
	      return false; // else return false;
	   }
}
