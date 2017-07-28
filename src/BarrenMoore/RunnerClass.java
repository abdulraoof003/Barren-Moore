package BarrenMoore;

public abstract class RunnerClass {

	// Setting location variables which need to be available through out the game.

	
	
	public static void main(String[] args) {
	
		// Create class Game
		Game gm = new Game();

		System.out.println("You've have just woken up. Grey foggy clouds float oppressively close to you, reflected in the murky grey water " + 
		" which reaches up your shins. Some black plants barely poke out of the shallow water. You need to decide where to go " +
        " You do are completly disorientated and do not know where you are. You find a piece of paper and it tells you that you can get out of this land." + 
        "You are able to move: Up, Down, Left or Right. If you collect three treasures you will escape from this land");

		gm.createMap();
		
		gm.movement();
		
	}

}
