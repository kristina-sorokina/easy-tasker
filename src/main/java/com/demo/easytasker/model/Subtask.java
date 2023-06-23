package com.demo.easytasker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "subtasks")
public class Subtask {
    @Id
    @SequenceGenerator(
            name = "subtask_sequence",
            sequenceName = "subtask_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String description;
    @Column(name = "date_created", nullable = false)
    private LocalDateTime dateCreated;
    @Column(name = "due_date")
    private LocalDateTime dueDate;
    @Column(name = "done")
    private Boolean isDone;
    @Column(name = "task_id")
    private Long taskId;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(insertable=false, updatable=false)
    private Task task;
}
