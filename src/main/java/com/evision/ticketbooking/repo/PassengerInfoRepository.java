package com.evision.ticketbooking.repo;

import com.evision.ticketbooking.model.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {

}
