package org.example.Services;



import org.example.Exceptions.ApiException;
import org.example.Model.Room;
import org.example.Model.Student;
import org.example.Repository.DataRepository;
import org.springframework.stereotype.Service;

@Service
public class AssignmentServices {

    public String assignStudent(String studentId, String roomId) {
        Room room = DataRepository.rooms.get(roomId);
        Student student = DataRepository.students.get(studentId);

        if (room == null || student == null) {
            throw new ApiException("Room or student not found");
        }

        if (!room.assign(studentId)) {
            throw new ApiException("Room is full");
        }

        return "Student assigned to room.";
    }

    public String removeStudent(String studentId, String roomId) {
        Room room = DataRepository.rooms.get(roomId);

        if (room == null) {
            throw new ApiException("Room not found");
        }

        room.remove(studentId);
        return "Student removed from room.";
    }
}
