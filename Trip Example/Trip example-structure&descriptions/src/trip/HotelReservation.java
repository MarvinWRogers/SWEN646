package trip;

import java.util.Date;

public class HotelReservation extends Reservation {

  public Address address;

  public String roomType;   // single or double

  public Date checkIn;

  public Date checkOut;

  //format and return object's data in XML format
  public String toString() {
	  return null;
  }

  //calculate and return the reservation's price
  public float calculatePrice() {
	  return 0.0f;
  }

  //update reservation data using passed in parameters
  public void updateHotelReservation(String roomType, Date checkIn, Date checkOut, Address address) {
  }

  //create and return a copy of the object
  public HotelReservation clone() {
	  return null;
  }

}