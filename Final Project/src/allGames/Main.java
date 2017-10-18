package allGames;

import java.util.Scanner;

//Selects the game
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("1. ObsatcleCourse \n2. TicTacToe \n3. War \nChoose your game>>");
		int game = input.nextInt();
		
		if(game == 1)
		{
			ObstacleCourse.main(args);
		}
		if(game == 2)
		{
			TicTacToe.main(args);
		}
		if(game == 3) {
			War.main(args);
		}
	}

}