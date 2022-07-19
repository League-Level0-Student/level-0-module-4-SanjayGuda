package _02_boolean._3_game_over;

import java.io.IOException;

import javax.swing.JOptionPane;

public class GameOver {
	
	public static void main(String[] args) {

		boolean gameOver = false;
		
		// 1. Ask the user if the game is over and save their answer.
		while(!gameOver) {
		String game = JOptionPane.showInputDialog("Is the game over?");
		// 2. If they answer "yes" change gameOver to true.
			
			if(game.equalsIgnoreCase("yes")) {
				 gameOver = true;
			}
		}
		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.
		
		// 4. Tell the user the game is over outside the while loop.
		try {
			Runtime.getRuntime().exec("say this is a ransome note you have to pay your net worth which is 1 cent but it can even be lower and plus you are so poor so i dont think you can afford it hahahaha or else i will hire a hitman to kill you at a random time lol").waitFor();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
	}

}