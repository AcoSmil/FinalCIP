package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String id;
    private int capacity;
    private List<String> assignedStudents = new ArrayList<>();

    public Room() {}
    public Room(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public boolean assign(String studentId) {
        if (assignedStudents.size() < capacity) {
            assignedStudents.add(studentId);
            return true;
        }
        return false;
    }

    public void remove(String studentId) {

        assignedStudents.remove(studentId);
    }

    public String getId() {
        return id;
    }
    public int getCapacity() {
        return capacity;
    }
    public List<String> getAssignedStudents() {
        return assignedStudents;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
