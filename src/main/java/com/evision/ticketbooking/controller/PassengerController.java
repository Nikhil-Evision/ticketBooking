package com.evision.ticketbooking.controller;
import com.evision.ticketbooking.dto.FlightBookingAcknowledgement;
import com.evision.ticketbooking.dto.FlightBookingRequest;
import com.evision.ticketbooking.model.PassengerInfo;
import com.evision.ticketbooking.model.PaymentInfo;
import com.evision.ticketbooking.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/Passenger")
public class PassengerController {
    @Autowired
    private FlightBookingService service;

    @GetMapping
    public String homepage(){
        return "Connected Successfully..........";
    }
    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return service.bookFlightTicket(request);
    }
    @GetMapping("/findAll")
    public List<PassengerInfo> getAllPassenger(){
        return service.getAll();
    }
    @GetMapping("/findAllinfo")
    public List<PaymentInfo> getAllInfo(){
        return service.gelAllInfo();
    }



































































































































//    @GetMapping("/getAll")
//    public List<PassengerInfo> getAllPassengers(){
//        return this.passengerService.getAllPassengerDetails();
//    }
//    @PostMapping("/addTripDetails")
//    public String addTripDetails(@RequestBody PassengerInfo passengerInfo){
//        this.passengerService.addPassengerDetails(passengerInfo);
//        return "Details Updated Successfully............";
//
//    }
//    @DeleteMapping("/DeleteDetails/{id}")
//    public String DeleteEntry(@PathVariable long id){
//        this.passengerService.deleteInfoById(id);
//        return "History Removed Successfully from the database ";
//    }
//

//    @DeleteMapping("/items/{id}")
//    public ResponseEntity<String> deleteItem(@PathVariable Long id) {
//        Passenger passenger = passengerRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Item not found with id: " + id));
//
//        item.setDeleted(true); // Mark as deleted
//
//        itemRepository.save(item); // Update the entity
//
//        return ResponseEntity.ok("Item deleted successfully");
//    }


}
