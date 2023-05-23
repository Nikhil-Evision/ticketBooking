package com.evision.ticketbooking.service;

import com.evision.ticketbooking.dto.FlightBookingAcknowledgement;
import com.evision.ticketbooking.dto.FlightBookingRequest;
import com.evision.ticketbooking.model.PassengerInfo;
import com.evision.ticketbooking.model.PaymentInfo;
import com.evision.ticketbooking.repo.PassengerInfoRepository;
import com.evision.ticketbooking.repo.PaymentInfoRepository;
import com.evision.ticketbooking.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){
        FlightBookingAcknowledgement flightBookingAcknowledgement = null;
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);
        PaymentInfo paymentInfo = request.getPaymentInfo();
//        paymentInfo = paymentInfoRepository.save(paymentInfo);
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        passengerInfo.setId(paymentInfo.getPassengerId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("Success ", passengerInfo.getFare(),passengerInfo);
    }

    public List<PassengerInfo> getAll() {
        return passengerInfoRepository.findAll();
    }
    public List<PaymentInfo> gelAllInfo(){
        return paymentInfoRepository.findAll();
    }


}
