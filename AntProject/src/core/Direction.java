package core;

/**sweedo*/

public enum Direction {
	NORTH("^ "), SOUTH("v "), EAST("<-"), WEST("->");
	
	private String value;
	
	Direction(String value){
		this.value=value;
	}
	
	public String getDirection(){
		return value;
	}
	
}
