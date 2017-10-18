package allGames;

import java.util.Scanner;

//Selects the game
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//picks the game
		System.out.println("1. ObsatcleCourse \n2. TicTacToe \n3. War \nChoose your game>>");
		int choice = input.nextInt();
		
		//if one is pressed, go to obstaclecourse
		if(choice == 1)
		{
			ObstacleCourse.main(args);
		}
		//if two pressed, go to tictactoe
		if(choice == 2)
		{
			TicTacToe.main(args);
		}
		//If three pressed, go to war
		{
		if(choice == 3) 
			War.main(args);
		}
	}

}