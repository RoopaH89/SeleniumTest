package com.programs;

public class LearnString102 {

	public static void main(String[] args) {

		String str1="Welcome to Test Automation";
		String[] split_str=str1.split(" ");
		int length=0;
		length=split_str.length-1;
		for(int i=0;i<=length; i++)
		{
			char[] c=split_str[i].toCharArray();
			for (int j = c.length-1; j >=0; j--) {
				System.out.print(c[j]);
			}
			System.out.print(" ");

		}
	}

}
