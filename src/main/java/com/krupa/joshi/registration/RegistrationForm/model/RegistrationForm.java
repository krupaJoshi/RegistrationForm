package com.krupa.joshi.registration.RegistrationForm.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "registration_details")
public class RegistrationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reg_id")
    private int id;

    @Column(name = "first_name")
    @NotEmpty(message = "*Please provide a First name")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "*Please provide a Last name")
    private String lastName;

    @Column(name = "address1")
    @NotEmpty(message = "*Please provide an address1")
    private String address1;

    @Column(name = "address2")
    @NotEmpty(message = "*Please provide an address2")
    private String address2;

    @Column(name = "city")
    @NotEmpty(message = "*Please provide your City")
    private String city;

    @Column(name = "state")
    @NotEmpty(message = "*Please provide State")
    private String state;

    @Column(name = "zip")
    @Pattern(regexp="^[0-9]{5}(-[0-9]{4})?$", message = "*Zip code should be either 5 digit or 9 digits")
    @NotEmpty(message = "*Please provide Zip Code")
    private String zip;

    @Column(name = "country")
    private String country;


}

