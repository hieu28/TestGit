package com.example.service.impl;


import com.example.converter.BookingConverter;
import com.example.model.entity.Booking;
import com.example.model.response.BookingDTO;
import com.example.repository.BookingRepository;
import com.example.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService implements IBookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private BookingConverter bookingConverter;

    @Override
    public BookingDTO save(BookingDTO bookingDTO) {
        Booking booking = bookingConverter.toEntity(bookingDTO);
        booking= bookingRepository.save(booking);
        return bookingConverter.toDTO(booking);
    }

    //    @Override
//    public void delete(long[] ids) {
//        for(long item: ids) {
//            roomRepository.delete(item);
//        }
//    }
    @Override
    public void deletebooking(Long id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public BookingDTO update(Long id, BookingDTO bookingDTO) {
        Booking booking = new Booking();
        Booking oldBooking= bookingRepository.findOneById(bookingDTO.getId());
        booking= bookingConverter.toEntity(bookingDTO,oldBooking);
        booking=bookingRepository.save(booking);
        return bookingConverter.toDTO(booking);
    }

    @Override
    public BookingDTO getBookingById(Long id) {
        Booking booking = new Booking();
        booking = bookingRepository.findOneById(id);

        return bookingConverter.toDTO(booking);
    }
}
