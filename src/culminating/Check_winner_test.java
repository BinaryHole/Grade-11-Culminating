package culminating;

import java.util.Scanner;

public class Check_winner_test {

	public static int[][] grid;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean userContinue = true;
		
		do {
			System.out.println("\n==================\n"
					+ "PVP GAME SELECTED!\n"
					+ "==================\n\n"
					+ "Please enter the desired grid size (MAX: 10) :");
			int gridSize = Integer.parseInt(scan.nextLine());
			
			doMove(gridSize);
			checkWinner();
			
		} while(userContinue);
		
	}

	/**
	 * Allows the current player to make a move
	 * @param player - current player number making the move.
	 **/
	public static void doMove(int player) {
		System.out.println("Player " + player + "'s move:"
				+ "\nPlease choose a column to place your piece");
	}
	
	public static int[][] placePiece(int gridSize) {
		int[][] updatedGrid = new int[gridSize][gridSize];
		
		
		return updatedGrid;
	}

	/*
	 * Checks to see if the user won after their move
	 */
	public static void checkWinner() {

	}
}
