package com.evision.ticketbooking.dto;

import com.evision.ticketbooking.model.PassengerInfo;
import com.evision.ticketbooking.model.PaymentInfo;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;


}
