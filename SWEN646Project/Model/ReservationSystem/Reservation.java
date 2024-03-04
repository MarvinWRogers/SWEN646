package ReservationSystem;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Reservation {

    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * 
     */
    private int accountNumber;

    /**
     * 
     */
    private string mailingAddress;

    /**
     * 
     */
    private string emailAddress;

    /**
     * 
     */
    private int accountNumber;

    /**
     * 
     */
    private int lodgingSize;

    /**
     * 
     */
    private int numberOfBedrooms;

    /**
     * 
     */
    private int numberOfBathrooms;

    /**
     * 
     */
    private double price;

    /**
     * 
     */
    private void updateMailingAddress() {
        // TODO implement here
    }

    /**
     * 
     */
    public void updateMailingAddress() {
        // TODO implement here
    }

    /**
     * 
     */
    public class hotelReservation {

        /**
         * Default constructor
         */
        public hotelReservation() {
        }

        /**
         * 
         */
        public boolean hasKitchnette;

    }

    /**
     * 
     */
    public class cabinReservation {

        /**
         * Default constructor
         */
        public cabinReservation() {
        }

        /**
         * 
         */
        public boolean hasLoft;

    }

    /**
     * 
     */
    public class houseReservation {

        /**
         * Default constructor
         */
        public houseReservation() {
        }

        /**
         * 
         */
        public int hasFloors;

    }

    /**
     * 
     */
    public enum ReservationStatus {
        DRAFT,
        COMPLETED,
        CANCELLED
    }

}