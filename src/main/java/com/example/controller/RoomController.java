package com.example.controller;

import com.example.model.dto.RoomDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class RoomController {
    @Autowired
    private com.example.sevice.IRoomService roomService;

    @PostMapping(value = "/room")
    public RoomDTO insertRoom(@RequestBody RoomDTO model) {
        return roomService.save(model);
    }

    @PutMapping(value = "/room/{id}")
    public RoomDTO updateNew(@RequestBody RoomDTO model, @PathVariable("id") long id) {
        model.setId(id);
        return roomService.save(model);
    }

    @DeleteMapping(value = "/room/{id}")
    public void deleteNew(@PathVariable("id") long ids) {
        roomService.delete(ids);
    }
}