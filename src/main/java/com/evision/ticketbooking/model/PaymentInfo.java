package com.evision.ticketbooking.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Payment_info")
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    @Column(name = "Account_Number")
    private int accountNo;
    @Column(name = "Amount")
    private double amount;
    @Column(name = "CardType")
    private String cardType;
    @Column(name = "Passenger_Id")
    private int passengerId;

}
