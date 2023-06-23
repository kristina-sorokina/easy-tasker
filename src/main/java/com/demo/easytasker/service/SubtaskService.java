package com.demo.easytasker.service;

import com.demo.easytasker.model.Subtask;
import com.demo.easytasker.repository.SubtaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubtaskService {
    private final SubtaskRepository repository;
    private final TaskService taskService;

    public SubtaskService(SubtaskRepository repository, TaskService taskService) {
        this.repository = repository;
        this.taskService = taskService;
    }

    public List<Subtask> getAllSubtasks() {
       return repository.findAll();
    }
    public void addSubtask(Long taskId, Subtask subtask) {
        subtask.setTaskId(taskService.getTaskById(taskId).getId());
        repository.save(subtask);
    }
}
