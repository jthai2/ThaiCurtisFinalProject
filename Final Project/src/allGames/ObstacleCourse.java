package allGames;

import java.util.Scanner;

public class ObstacleCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String choiceString; 
		
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
		Scanner input = new Scanner(System.in);
		
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
			Scanner input = new Scanner(System.in);
			
			String choiceString;
			
			System.out.println("Do bald people shampoo their head?>> ");
			choiceString = input.next();
			
			if("Yes".equalsIgnoreCase(choiceString))
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
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			System.out.println("Is sand called sand because it's between sea and land? 'YES' or 'NO'>> ");
			choiceString = input.next();
			
			if("No".equalsIgnoreCase(choiceString))
			{
				System.out.println("Right \nThe word sand is thought to have originated from an Old English word, which itself "
						+ "originated from the old Dutch word sant, which became zand"); 
			question4();	
			}
			else
			{
				System.out.println("Wrong, start over...");
			}
		}
		public static void question4()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			System.out.println("Test question");
			choiceString = input.next();
		}
}
