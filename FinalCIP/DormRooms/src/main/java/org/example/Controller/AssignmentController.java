package org.example.Controller;

import org.example.Services.AssignmentServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assign")
public class AssignmentController {

    private final AssignmentServices assignmentService;

    public AssignmentController(AssignmentServices assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping
    public String assignStudent(@RequestParam String studentId, @RequestParam String roomId) {
        return assignmentService.assignStudent(studentId, roomId);
    }

    @DeleteMapping
    public String removeStudent(@RequestParam String studentId, @RequestParam String roomId) {
        return assignmentService.removeStudent(studentId, roomId);
    }
}
