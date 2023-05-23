package com.evision.ticketbooking.repo;

import com.evision.ticketbooking.model.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,Integer> {


}
