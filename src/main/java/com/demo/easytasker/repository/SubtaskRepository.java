package com.demo.easytasker.repository;

import com.demo.easytasker.model.Subtask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubtaskRepository extends JpaRepository<Subtask, Long> {
//    @Query("SELECT s FROM Subtask s WHERE s.taskId = ?1")
//    List<Subtask> findSubtasksByTaskId(Long taskId);
}
