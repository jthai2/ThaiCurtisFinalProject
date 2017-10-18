package allGames;

import java.util.Scanner;

//Selects the game
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. ObsatcleCourse \n2. TicTacToe \n3. War \nChoose your game>>");
		int choice = input.nextInt();
		
		if(choice == 1)
		{
			ObstacleCourse.main(args);
		}
		if(choice == 2)
		{
			TicTacToe.main(args);
		}
		if(choice == 3) {
			War.main(args);
		}
	}

}