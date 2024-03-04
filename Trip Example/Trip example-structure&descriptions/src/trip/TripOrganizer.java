package trip;

public class TripOrganizer {

  public Trip trip;		// store and manage a single trip.Trip object at a time

  // Add reservation to the currently loaded trip.Trip
  public void addReservation(Reservation reservation) {
  }

  // save current trip.Trip data to a file
  public void saveToFile(String filename) {
  }

  // load a trip.Trip object from a file
  public void openFromFile(String filename) {
  }

  // update the currently loaded trip.Trip's reservation (one that matches the parameter)
  public void editReservation(Reservation reservation) {
  }

  // delete reservation matching conf number from currently loaded trip
  public void deleteReservation(String confirmationNumber) {
  }

  // delete the currently loaded trip.Trip and its file (value smust match)
  public void deleteTrip(String fileName) {
  }

  // load new trip.Trip from the passed in object (close the currently loaded trip.Trip)
  public void createNewTrip(Trip trip) {
  }

}