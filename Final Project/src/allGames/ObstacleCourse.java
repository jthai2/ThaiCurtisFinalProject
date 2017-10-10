package allGames;

import java.util.Scanner;

public class ObstacleCourse {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceString; 
//		int questionNum;
//		int [] questionNumArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Welcome to this game, you will need to complete 10 questions to pass this course. "
				+ "\nPay attention to every detail because you might get answers from it. \nIf you don't get the answer right in 3 attempts,"
				+ " you will be placed back to the previous question. \nAre you ready? 'YES' to continue, 'NO' to quit>>");
		choiceString = input.next();
		while("Yes".equalsIgnoreCase(choiceString))
				{
					questions1();
				}
		if("No".equalsIgnoreCase(choiceString))
		{
			System.out.println("You're trash");
			System.exit(0);
		}
		
	}
		public static void questions1()
{
		String choiceString; 
		int question1 = 6;
		
		System.out.println("sserP ehT sretteL xiS oT eunitnonC>>");
		choiceString = input.next();
		
		if("Six".equalsIgnoreCase(choiceString))
		{
			question2();
		}
		else
		{
			System.out.println("Wrong, start over...");
		}
}
		
		public static void question2()
{
			String choiceString;
			
			System.out.println("There was an airplane crash, every single person on board died, but yet two people survived. \nHow is this possible?>> ");
			choiceString = input.next();
			
			if("The two were married".equalsIgnoreCase(choiceString) || "The 2 were married".equalsIgnoreCase(choiceString) 
					|| "2 were married".equalsIgnoreCase(choiceString) || "Two were married".equalsIgnoreCase(choiceString)
					|| "They were married".equalsIgnoreCase(choiceString))
			{
				question3();
			}
			else
			{
				System.out.println("Wrong, start over...");
			}
}
		public static void question3()
		{
			String choiceString;
			
			System.out.println("Test question>>");
			choiceString = input.next();
		
		}
}
