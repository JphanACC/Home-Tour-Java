package game;

import java.util.Scanner;

import fixtures.Room;
 

public class Main {
	public static void main(String[] args) {
		
		RoomManager newGame = new RoomManager();
		newGame.init();
		Player newPlayer = new Player();
		
		newPlayer.currentRoom = newGame.startingRoom;
		
		System.out.println("Welcome to the Hall Tour. Type to follow the directions");
		
		while (newPlayer.gameStatus) {
			System.out.println("Game: You can type 'go north, west, east, south'. Type 'exit' to quit game.");
			printRoom(newPlayer);
			System.out.println("Short Description: " + newPlayer.currentRoom.getshortDescription());
			System.out.println("Long Description: " + newPlayer.currentRoom.getlongDescription());
			System.out.println("Game: Please specify where you want to go next");
			
			parse(collectInput(), newPlayer);
		}
		
	}
	
	private static void printRoom(Player player) {
		System.out.println("You are current in room: " + player.currentRoom.getName());
		
	}

	private static String[] collectInput() {
		Scanner in = new Scanner(System.in);

		String playerInput = in.nextLine().toLowerCase();
		
		String[] parts = playerInput.split(" ");
		
		return parts;
	}
		
	private static void parse(String[] command, Player player) {
		
		switch(command[0]) {
			case "go":
				switch (command[1]) {
					case "north":
						if (player.currentRoom.getExit("north") != null) {
							player.currentRoom = player.currentRoom.getExit("north");
						} else {
							System.out.println("There is nothing over here. Get back");
						}
						break;
					case "east":
						if (player.currentRoom.getExit("east") != null) {
							player.currentRoom = player.currentRoom.getExit("east");
						} else {
							System.out.println("There is nothing over here. Get back");
						}
						break;
						
					case "south":
						if (player.currentRoom.getExit("south") != null) {
							player.currentRoom = player.currentRoom.getExit("south");
						} else {
							System.out.println("There is nothing over here. Get back");
						}
						break;
						
					case "west":
						if (player.currentRoom.getExit("west") != null) {
							player.currentRoom = player.currentRoom.getExit("west");
						} else {
							System.out.println("There is nothing over here. Get back");
						}
						break;
				}
				break;
			case "exit":
				System.out.println("Game: Game is now exited. Press Play to start over");
				player.gameStatus = false;
				break;
			default:
				System.out.println("Invalid input. Type in 'go + direction' ");
		}
	}	
}
