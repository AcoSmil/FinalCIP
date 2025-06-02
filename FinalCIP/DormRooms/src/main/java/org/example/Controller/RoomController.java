package org.example.Controller;


import org.example.Model.Room;
import org.example.Services.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public String addRoom(@RequestBody Room room) {
        return roomService.addRoom(room);
    }

    @GetMapping
    public Collection<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
}
