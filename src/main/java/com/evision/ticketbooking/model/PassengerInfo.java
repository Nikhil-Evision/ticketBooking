package com.evision.ticketbooking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Passenger_info")
public class PassengerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Name")
    private String name;

    @Column(name = "Source")
    private String source;

    @Column(name = "Destination")
    private String destination;

    @Column(name = "Fare")
    private int fare;

    @Column(name = "Date-of-Travel")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private Date date;

}
