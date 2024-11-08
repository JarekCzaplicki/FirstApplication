package entity;

import jakarta.persistence.*;

@Entity
@Table(name="GUESTS")
public class Guest {
    @Id
    @Column(name="GUEST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Oracle uses SEQUENCE
    private Long guestId;
    @Column(name="FIRST_NAME")
    private String firstName; //first_name FIRST_NAME
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="PHONE_NUMBER")
    private String phoneNumber;

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    @Override
//    public String toString() {
//        return "Guest{" +
//                "guestId=" + guestId +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", emailAddress='" + emailAddress + '\'' +
//                ", address='" + address + '\'' +
//                ", country='" + country + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
}
