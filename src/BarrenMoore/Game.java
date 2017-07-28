package BarrenMoore;

import java.util.Scanner;

import library.Item;

public class Game {

	public void createMap() {

		char grid[][] = new char[12][12];
		Scanner move = new Scanner(System.in);
		System.out.println("Here is the current game board:");
		System.out.println("-------------------------------");

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
				grid[9][9] = 'T';
				System.out.print(grid[i][j]);
			}
			System.out.println("");
		}
		System.out.print("Enter your move (U/D/L/R)>");
	}

}
