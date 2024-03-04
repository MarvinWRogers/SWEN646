package trip;

import java.util.Date;

public class RentalCarReservation extends Reservation {

  public String make;

  public String model;

  public Date scheduledPickUp;

  public Date scheduledDropOff;

  public Date actualPickUp;

  public Date actualDropOff;

  public float window;  // window of how far on either side the car can be picked up and dropped off

  // update reservation data using passed in parameters
  public void updateRentalCarReservation(String make, String model, Date scheduledPickUp, Date scheduledDropOff, Date actualPickUp, Date actualDropOff, float window) {
  }

  //format and return object's data in XML format
  public String toString() {
	  return null;
  }

  //calculate and return the reservation's price
  public float calculatePrice() {
	  return 0.0f;
  }

  //create and return a copy of the object
  public RentalCarReservation clone() {
	  return null;
  }

}