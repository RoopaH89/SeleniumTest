package com.programs;

import java.util.Scanner;

public class LearnString101 {

	public static void main(String[] args) {

        System.out.println("Enter a String:");

		// Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
 
        String str = in.nextLine();
        System.out.println("You entered string " + str);
        
       
          // closing scanner
          in.close();
	}

}
