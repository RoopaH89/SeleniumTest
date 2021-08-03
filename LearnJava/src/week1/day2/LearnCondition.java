package week1.day2;

public class LearnCondition {

	public static void main(String[] args) {

		int age=90;
		
		if(age<18)
		{
			System.out.println("Minor");
		}
		else if(age>18 && age<60)
		{
			System.out.println("Adult");

		}
		else if(age>=60 && age<80)
		{
			System.out.println("Senior citizen");

		}
		else
		{
			System.out.println("Super Senior");

		}
	}

}
