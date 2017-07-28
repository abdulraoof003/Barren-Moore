package BarrenMoore;

import java.util.Scanner;

public class Game {

	static int playerXLoc, playerYLoc = 0;
	
	public void createMap() {


		char grid[][] = new char[12][12];


		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				double random = Math.random();
				if (random <= .05) {
					grid[i][j] = '*';
				} else if (random > .06 && random <= .15) {
					grid[i][j] = 'X';
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
		  case "u": playerYLoc += 1; break;
		  case "d": playerYLoc -= 1; break;
		  case "r": playerXLoc += 1; break;
		  case "l": playerXLoc -= 1; break;
		}
		System.out.println("Contents of location x " + playerXLoc); 		
	}
	
}
