package trip;

import java.util.Date;

public class AirplaneReservation extends Reservation {

  public String sourceAirport;

  public String destinationAirport;

  public Date flightDate;

  public String airline;  // 3 letter airport designation

  //format and return object's data in XML format
  public String toString() {
	  return null;
  }

  //update reservation data using passed in parameters
  public void updateAirplaneReservation(String aline, String sAirport, String dAirport, Date fDate) {
  }

  // calculate and return the distance between source and destination airport
  public int airportDistance() {
	  return 0;
  }

  //calculate and return the reservation's price
  public float calculatePrice() {
	  return 0.0f;
  }

  //create and return a copy of the object
  public AirplaneReservation clone() {
	  return null;
  }

}