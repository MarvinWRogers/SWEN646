package ReservationSystem;

// Reservation.java
public class Reservation {
    private int accountNumber;
    private String mailingAddress;
    private String emailAddress;
    private int lodgingSize;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double price;

    // Constructors
    public Reservation() {
    }

    public Reservation(int accountNumber, String mailingAddress, String emailAddress, int lodgingSize,
                       int numberOfBedrooms, int numberOfBathrooms, double price) {
        this.accountNumber = accountNumber;
        this.mailingAddress = mailingAddress;
        this.emailAddress = emailAddress;
        this.lodgingSize = lodgingSize;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.price = price;
    }

    // Get methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getLodgingSize() {
        return lodgingSize;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public double getPrice() {
        return price;
    }

    // Set methods
    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Reservation{" +
                "accountNumber=" + accountNumber +
                ", mailingAddress='" + mailingAddress + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", lodgingSize=" + lodgingSize +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", price=" + price +
                '}';
    }
}