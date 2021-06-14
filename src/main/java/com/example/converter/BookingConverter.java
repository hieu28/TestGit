package com.example.converter;

import com.example.model.entity.Booking;
import com.example.model.response.BookingDTO;
import org.springframework.stereotype.Component;

@Component
public class BookingConverter {
    public Booking toEntity(BookingDTO dto) {
        Booking bookingEntity = new Booking();
        bookingEntity.setId(dto.getId());
        bookingEntity.setCheckIn(dto.getCheckIn());
        bookingEntity.setChechOut(dto.getChechOut());
        bookingEntity.setNumberOfMember(dto.getNumberOfMember());
        bookingEntity.setEmployeeId(dto.getEmployeeId());
        bookingEntity.setRoomId(dto.getRoomId());
        bookingEntity.setTitle(dto.getTitle());
        return bookingEntity;
    }

    public BookingDTO toDTO(Booking bookingEntity) {
        BookingDTO dto = new BookingDTO();
        if (bookingEntity.getId() != null) {
            dto.setId(bookingEntity.getId());
        }
        dto.setCheckIn(bookingEntity.getCheckIn());
        dto.setChechOut(bookingEntity.getChechOut());
        dto.setNumberOfMember(bookingEntity.getNumberOfMember());
        dto.setEmployeeId(bookingEntity.getEmployeeId());
        dto.setRoomId(bookingEntity.getRoomId());
        dto.setTitle(bookingEntity.getTitle());
        return dto;
    }

    public Booking toEntity(BookingDTO dto, Booking bookingEntity) {
        bookingEntity.setId(dto.getId());
        bookingEntity.setCheckIn(dto.getCheckIn());
        bookingEntity.setChechOut(dto.getChechOut());
        bookingEntity.setNumberOfMember(dto.getNumberOfMember());
        bookingEntity.setEmployeeId(dto.getEmployeeId());
        bookingEntity.setRoomId(dto.getRoomId());
        bookingEntity.setTitle(dto.getTitle());
        return bookingEntity;
    }
}
