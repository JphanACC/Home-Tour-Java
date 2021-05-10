package fixtures;

public class Room extends Fixture {
	String name;
	private Room[] exits;

	
	//constructor
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
	}
	
	//methods
	
	public Room[] getExits() {
		return this.exits;
	}
	
	public Room getExit(String direction) {
		
		switch(direction) {
			case "north":
				return this.exits[0];
			case "east":
				return this.exits[1];
			case "south":
				return this.exits[2];
			case "west":
				return this.exits[3];
		}
		return null;
	}
	
	public void setExit(Room north, Room east, Room south, Room west) {
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;
		
	}
}

