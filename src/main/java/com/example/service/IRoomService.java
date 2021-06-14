package com.example.service;

import com.example.model.dto.RoomDTO;

import java.util.List;

public interface IRoomService {
    public List<RoomDTO> findAll();
    public RoomDTO findById(long id);
    public RoomDTO save(RoomDTO r);
    public boolean delete(long id);
}