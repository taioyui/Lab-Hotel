
package ie.cct.objectorientedconstructs;
// you do not need to do anything to this file, just use it
public enum Month {
	JANUARY(31),
	FEBRUARY(28),
	MARCH(31),
	APRIL(30),
	MAY(31),
	JUNE(30),
	JULY(31),
	AUGUST(31),
	SEPTEMBER(30),
	OCTOBER(31),
	NOVEMBER(30),
	DECEMBER(31);
	// how many days in a month
	private int numberOfDays = 0;
	// constructor
	Month(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	// get the number of days in a particular month
	public int getNumberOfDays() {
		return numberOfDays;
	}
	
}
