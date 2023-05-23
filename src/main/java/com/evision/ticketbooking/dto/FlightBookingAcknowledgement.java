package com.evision.ticketbooking.dto;

import com.evision.ticketbooking.model.PassengerInfo;
import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private double totalFare;
    private PassengerInfo passengerInfo;
}
