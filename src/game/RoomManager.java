package game;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	
	Room[] rooms = new Room[7];
	
	public void init() {
		Room foyer = new Room(
				"The Foyer Room",
				"a small room",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
				+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
				+ "To the north is a small room, where you can see a piano.");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
		
		Room diningRoom = new Room(
				"The dining room",
				"a dining room",
				"You've arrived at dining room. There is nothing to see here" + "\n"
				+ "You can jump out of window by going to the west, leading to back yard" + "\n");
		this.rooms[1] = diningRoom;
		
		Room backyard = new Room(
				"The backyard",
				"an empty backyard",
				"You've arrived at the backyard. There is nothing here at all." + "\n"
				+ "You can go North to go back to diningRoom" + "\n");
		this.rooms[2] = backyard;
		
		//Second floor
		Room secondFloor = new Room(
				"The second floor",
				"hallway in second floor",
				"You've climbed stairs and arrived at 2nd floor hall way. Going to South lead to bed room" + "\n"
				+ "You can go West to arrive at study room." + "\n"
				+ "To go back to foyer, go East." + "\n");
		this.rooms[3] = secondFloor;
		
		Room studyRoom = new Room(
				"The study room",
				"a small study room",
				"You've arrived at the study room. Go East to lead back to the second floor's hallway" + "\n");
		this.rooms[4] = studyRoom;
		
		Room bedRoom = new Room(
				"The bed room",
				"a small bed room",
				"You've arrived at the bed room. Go North to lead back to the second floor's hallway" + "\n");
		this.rooms[5] = bedRoom;

		//Piano room
		Room pianoRoom = new Room(
				"The piano room",
				"a piano room",
				"You've arrived at piano room. Nothing to see here" + "\n"
				+ "To go back to foyer, go South." + "\n");
		this.rooms[6] = pianoRoom;
		
		//setExit
		//north, east, south, west
		foyer.setExit(pianoRoom, null, diningRoom, secondFloor);
		diningRoom.setExit(foyer, null, null, backyard);
		backyard.setExit(null, diningRoom, null, null);
		secondFloor.setExit(null, foyer, bedRoom, studyRoom);
		studyRoom.setExit(null, secondFloor, null, null);
		bedRoom.setExit(secondFloor, null, null, null);
		pianoRoom.setExit(null, null, foyer, null);
	}
}
