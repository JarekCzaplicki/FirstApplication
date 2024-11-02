package entity;

import jakarta.persistence.*;

@Entity
@Table(name="GUEST")
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
}
