package trip;

import java.util.List;

public class Trip {

  public List<Reservation> reservations;  // save and manage multiple trip.Reservation objects
  public Person organizer;  // person responsible for the trip
  public String theme;  // theme of the trip

  // add reservation object to the list of trip.Reservation objects (check for duplicates)
  // and return the number of reservation
  public int addReservation(Reservation reservation) {
	  return 0;
  }

  // find matching reservation in Vector list and update it with parameter's value
  public void updateReservation(Reservation reservation) {
  }

  // find trip.Reservation in Vector that matches conf number and delete from Vector
  public void deleteReservation(String confirmationNumber) {
  }

  // save trip.Trip information to the passed in file
  public void saveToFile(String fileName) {
  }

  // calculate and return the trip.Trip's price
  public float calculatePrice() {
	  return 0.0f;
  }

 }