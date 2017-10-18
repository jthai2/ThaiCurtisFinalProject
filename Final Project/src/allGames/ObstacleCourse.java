package allGames;

import java.util.Scanner;

public class ObstacleCourse {

	//Welcoming screen which also tells you what the game will be about
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String choiceString; 
		
		//print welcoming screen and if they're ready
		System.out.println("Welcome to this game, you will need to complete 10 questions to pass this course. "
				+ "\nPay attention to every detail because you might get answers from it. \nIf you don't get the answer right, you'll have to start over."
				+ " \nAre you ready? 'YES' to continue, 'NO' to quit>>");
		choiceString = input.next();
		//while yes is pressed, go to question 1
		while("Yes".equalsIgnoreCase(choiceString))
				{
					questions1();
				}
		//if no, end program
		if("No".equalsIgnoreCase(choiceString))
		{
			System.out.println("You're trash");
			System.exit(0);
		}
		
	}
		//Question 1 question and answer
		public static void questions1()
{
		Scanner input = new Scanner(System.in);
		
		String choiceString; 
		int question1 = 6;
		
		//question 1
		System.out.println("sserP ehT sretteL xiS oT eunitnonC>>");
		choiceString = input.next();
		
		//if Six is entered, go to question 2
		if("Six".equalsIgnoreCase(choiceString))
		{
			question2();
		}
		//else, start over
		else
		{
			System.out.println("Wrong, start over...");
		}
}
		//Question 2 question and answer
		public static void question2()
{
			Scanner input = new Scanner(System.in);
			
			String choiceString;
			
			//question2
			System.out.println("Do bald people shampoo their head? 'YES' or 'NO'>> ");
			choiceString = input.next();
			
			//if yes is answer, go to question 3
			if("Yes".equalsIgnoreCase(choiceString))
			{
				System.out.println("Your answer is right. \nThey shampoo their head to get rid of oil and dirt.");
				question3();
			}
			//else start over
			else
			{
				System.out.println("Wrong, start over...");
			}

}
		//Question 3 question and answer
		public static void question3()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			//question 3
			System.out.println("Is sand called sand because it's between sea and land? 'YES' or 'NO'>> ");
			choiceString = input.next();
			
			//if no is answer, go to question4
			if("No".equalsIgnoreCase(choiceString))
			{
				System.out.println("Your answer is right. \nThe word sand is thought to have originated from an Old English word, which itself "
						+ "originated from the old Dutch word sant, which became zand"); 
			question4();	
			}
			//else, start over
			else
			{
				System.out.println("Wrong, start over...");
			}
		}
		//Question 4 question and answer
		public static void question4()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			//question 4
			System.out.println("Is a tomato a fruit or vegetable? 'FRUIT' or 'VEGETABLE'>> ");
			choiceString = input.next();
			
			//if fruit is answer, go to question 5
			if("Fruit".equalsIgnoreCase(choiceString))
			{
				System.out.println("Your answer is right. \nTrue fruits are developed from the ovary in the base of the flower, "
						+ "and contain the seeds of the plant.");
				question5();
			}
			//if vegetable is answer, start over
			if("Vegetable".equalsIgnoreCase(choiceString))
			{
				System.out.println("Wrong, start over...");
			}
		}
		//Question 5 question and answer
		public static void question5()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			//question 5
			System.out.println("Type in the question that was asked on question 2."
					+ "\nType 'ONE' if you think it's 'Is sand called sand because it's between sea and land?' "
					+ "\nType 'TWO' if you think it's 'Do bald people shampoo their head?' "
					+ "\nType 'THREE' If you think it's 'sserP ehT sretteL xiS oT eunitnonC.'>> ");
			choiceString = input.next();
			
			//if two is answer, go to question6
			if("Two".equalsIgnoreCase(choiceString))
			{
				question6();
			}
			//else, start over
			else
			{
				System.out.println("Wrong, start over...");
			}
		}
		//Question 6 question and answer
		public static void question6()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			//question6
			System.out.println("Do people with dentures brush their teeth? 'YES' or 'NO'>> ");
			choiceString = input.next();
			
			//if yes, go to question 7
			if("Yes".equalsIgnoreCase(choiceString))
			{
				System.out.println("Your answer is right.");
				question7();
			}
			//else, start over
			else
			{
				System.out.println("Wrong, start over...");
			}
		}
		//Question 7 question and answer
		public static void question7()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			//question7
			System.out.println("If Pinocchio says, 'my nose will now grow,' what will happen?"
					+ "\nPress '1' for 'his nose will grow'."
					+ "\nPress '2' for 'his nose will not grow'"
					+ "\nPress '3' for 'no definite answer.'>> ");
			choiceString = input.next();
			
			//if 3 is answer, go to question8
			if("3".equalsIgnoreCase(choiceString))
			{
				System.out.println("Your answer is right.");
				question8();	
			}
			//else start over
			else
			{
				System.out.println("Wrong, start over...");
			}
		}
		//Question 8 question and answer
		public static void question8()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			//question 8
			System.out.println("Which came first,'CHICKEN' or 'EGG.'>> ");
			choiceString = input.next();
			
			//if egg is answer, go to question 9
			if("Egg".equalsIgnoreCase(choiceString))
			{
				System.out.println("Your answer is right.");
				question9();
			}
			//else, start over
			else
			{
				System.out.println("Wrong, start over...");
			}
		}
		//Question 9 question and answer
		public static void question9()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			//question9
			System.out.println("What was the answer to question 6?>> ");
			choiceString = input.next();
			
			//if yes is answer, go to question10
			if("Yes".equalsIgnoreCase(choiceString))
			{
				System.out.println("Your answer is right.");
				question10();
			}
			//else, start over
			else
			{
				System.out.println("Wrong, start over...");
			}
		}
		//Question 10 question and answer
		public static void question10()
		{
			Scanner input = new Scanner(System.in);
			String choiceString;
			
			//question10
			System.out.println("Is Game Of Thrones the greatest TV show of all time? 'YES' or 'NO' or 'DEFINITELYYES'>> ");
			choiceString = input.next();
			
			//if definitelyyes is answer, end program
			if("DEFINITELYYES".equalsIgnoreCase(choiceString))
			{
				System.out.println("Congratulations, you have completely this course!");
				System.exit(0);
			}
			//else, start over
			else
			{
				System.out.println("Trash, start over...");
			}
		}
}
