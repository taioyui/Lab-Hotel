package ie.cct.objectorientedconstructs;
// change these to match your project package
import ie.cct.objectorientedconstructs.s123456s234567s345678.Hotel;
import ie.cct.objectorientedconstructs.s123456s234567s345678.HotelManagementSystem;

// you do not submit this file, it is just a main method for you to see how your code is doing
public class SampleInteraction {
	public static void main(String[] args) {
        // create a new hotel management system
		HotelManagementSystem hm = new HotelManagementSystem();
        // build the hotel from the text file
		Hotel h = hm.setupHotel();
        // try some bookings
		h.bookRoom(Month.JANUARY, 1, RoomType.DOUBLE, 5);
		h.bookRoom(Month.JANUARY, 1, RoomType.DOUBLE, 5);
		h.bookRoom(Month.JANUARY, 1, RoomType.DOUBLE, 5);
		h.bookRoom(Month.JANUARY, 1, RoomType.DOUBLE, 5);
		h.bookRoom(Month.JANUARY, 1, RoomType.DOUBLE, 5);
		h.bookRoom(Month.FEBRUARY, 3, RoomType.SINGLE, 10);
		h.bookRoom(Month.FEBRUARY, 10, RoomType.PENTHOUSE, 12);
        // see the calendar for January for single rooms
		System.out.println(hm.getCalendar(Month.JANUARY, h, RoomType.SINGLE));
		
	}
}
