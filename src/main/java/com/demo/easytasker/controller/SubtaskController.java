package com.demo.easytasker.controller;

import com.demo.easytasker.model.Subtask;
import com.demo.easytasker.service.SubtaskService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SubtaskController {
    private final SubtaskService service;

    public SubtaskController(SubtaskService service) {
        this.service = service;
    }

    @GetMapping(path = "/subtasks")
    public List<Subtask> getAllSubtasks() {
        return service.getAllSubtasks();
    }

    @PostMapping(path = "tasks/{taskId}/subtasks")
    @ResponseStatus(HttpStatus.CREATED)
    public void addSubtask(@PathVariable Long taskId, @RequestBody Subtask subtask) {
        service.addSubtask(taskId, subtask);
    }
}
