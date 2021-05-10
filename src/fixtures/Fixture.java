package fixtures;

public abstract class Fixture {

	//a short name - title for the fixture
	public String name; 
		
	//an one-sentence-long description of a fixture, used to briefly mention the fixture 
	public String shortDescription; 
		
	//a paragraph-long description of the thing, displayed when the player investigates the fixture thoroughly (looks at it, or enters a room)
	public String longDescription;	
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	//get setters
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getshortDescription( ) {
		return this.shortDescription;
	}
	
	public void setshortDescription(String shortName) {
		this.shortDescription = shortName;
	}
	
	public String getlongDescription( ) {
		return this.longDescription;
	}
	
	public void setlongDescription(String longName) {
		this.longDescription = longName;
	}
	
	
}
