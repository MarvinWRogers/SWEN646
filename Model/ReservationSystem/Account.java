// Account.java
package ReservationSystem;
public class Account {
    private int accountNumber;
    private String mailingAddress;
    private String name;
    private int phoneNumber;

    // Constructors
    public Account() {
    }

    public Account(int accountNumber, String mailingAddress, String name, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.mailingAddress = mailingAddress;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Get methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    // Set methods
    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", mailingAddress='" + mailingAddress + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}