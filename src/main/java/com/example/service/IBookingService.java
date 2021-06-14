package com.example.service;


import com.example.model.response.BookingDTO;

public interface IBookingService {
    BookingDTO save(BookingDTO bookingDTO);
    //    void delete(long[] ids);
    void deletebooking(Long id);
    BookingDTO update(Long id,BookingDTO bookingDTO);
    BookingDTO getBookingById(Long id);
}
