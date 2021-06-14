package com.example.controller;

import com.example.model.response.BookingDTO;
import com.example.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class BookingAPI {

    @Autowired
    private IBookingService iBookingService;
    @PostMapping(value = "/booking")
    public BookingDTO createBooking(@RequestBody BookingDTO model) {
        return iBookingService.save(model);
    }

    @PutMapping(value = "/booking/{id}")

    public BookingDTO updateBooking(@RequestBody BookingDTO model, @PathVariable("id") long id) {
        model.setId(id);
        return iBookingService.save(model);
    }
    @DeleteMapping(value = "/booking/{id}")
    public String deleteBooking(@PathVariable("id") long id) {
        iBookingService.deletebooking(id);
//        return new RoomRepository<Room>(HttpStatus.NO_CONTENT);
        return "xóa thành công";
    }
    @GetMapping(value = "/booking/{id}")

    public BookingDTO getById(@PathVariable("id") long id) {

        return iBookingService.getBookingById(id);
    }
}
