package org.example.Services;


import org.example.Model.Room;
import org.example.Repository.DataRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RoomService {

    public String addRoom(Room room) {
        DataRepository.rooms.put(room.getId(), room);
        return "Room added.";
    }

    public Collection<Room> getAllRooms() {
        return DataRepository.rooms.values();
    }
}
