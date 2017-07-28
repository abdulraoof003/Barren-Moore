package BarrenMoore;

import java.util.Scanner;

public class Game {

	static int playerXLoc, playerYLoc = 0;
	int treasuresCollected = 0;
	int livesRemaining = 3;

	
	
	private char[][] grid;

	public void createMap() {

		grid = new char[12][12];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				double random = Math.random();
				if (random <= .05) {
					grid[i][j] = 'L';
				} else if (random > .06 && random <= .15) {
					grid[i][j] = 'T';
				} else {
					grid[i][j] = '.';
				}
				grid[0][0] = 'P';

				System.out.print(grid[i][j]);
			}
			System.out.println("");
		}
	}

	public void movement() {
		
		String move = "";
		System.out.println("Enter your move (U/D/L/R)>");
		move = InputClass.sc.nextLine();

		switch (move) {

		  case "u": playerXLoc -= 1; break;
		  case "d": playerXLoc += 1; break;
		  case "r": playerYLoc += 1; break;
		  case "l": playerYLoc -= 1; break;
		
		
		
//		  case "u": playerYLoc += 1; break;  //goes right
//		  case "d": playerYLoc -= 1; break;  //goes left
//		  case "r": playerXLoc += 1; break;  //goes down
//		  case "l": playerXLoc -= 1; break;  //goes up
		}
		if (grid [playerXLoc] [playerYLoc] == 'T') {
			treasuresCollected += 1;}
		else if (grid [playerXLoc] [playerYLoc] == 'L') {
			livesRemaining -= 1;
		}

		grid[playerXLoc][playerYLoc] = 'P';
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println("");}
		
		
		
		System.out.println("Treasures Collected " + treasuresCollected);
		System.out.println("Lives remaining " + livesRemaining);
		
 		
	}
	
}
