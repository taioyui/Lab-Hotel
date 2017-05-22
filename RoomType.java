package ie.cct.objectorientedconstructs;
// you do not need to modify this, just use it
public enum RoomType {
	SINGLE(1),
	DOUBLE(2),
	PENTHOUSE(2);
	
	private int maxOccupants;
	
	RoomType(int maxOccupants) {
		this.maxOccupants = maxOccupants;
	}
	
	public int getMaxOccupants() {
		return maxOccupants;
	}
}
