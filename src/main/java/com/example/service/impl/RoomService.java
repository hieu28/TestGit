package com.example.sevice.impl;

import com.example.model.dto.RoomDTO;
import com.example.model.entities.RoomEntity;
import com.example.repository.RoomRepository;
import com.example.sevice.IRoomService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService implements IRoomService {
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<RoomDTO> findAll() {
        List<RoomDTO> result = new ArrayList<>();
        List<RoomEntity> entities = roomRepository.findAll();
        for (RoomEntity item: entities) {
            RoomDTO roomDTO = mapper.map(result, RoomDTO.class);
            result.add(roomDTO);
        }
        return result;
    }

    @Override
    public RoomDTO findById(long id) {
        Optional<RoomEntity> entity = roomRepository.findById(id);
        return mapper.map(entity, RoomDTO.class);
    }

    @Override
    @Transactional
    public RoomDTO save(RoomDTO r) {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity = mapper.map(r, RoomEntity.class);
        roomEntity = roomRepository.save(roomEntity);
        return mapper.map(roomEntity, RoomDTO.class);
    }


    @Override
    public boolean delete( long ids) {
        try {
            roomRepository.deleteById(ids);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }
}