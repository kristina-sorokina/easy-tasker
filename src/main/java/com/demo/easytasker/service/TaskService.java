package com.demo.easytasker.service;

import com.demo.easytasker.model.Task;
import com.demo.easytasker.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public void addTask(Task task) {
        repository.save(task);
    }

    public void deleteTaskById(Long taskId) {
        repository.deleteById(taskId);
    }

    public Task getTaskById(Long taskId) {
        return repository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task with id " + taskId + " does not exist"));
    }
}
