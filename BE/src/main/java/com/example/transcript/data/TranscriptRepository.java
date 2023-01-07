package com.example.transcript.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.transcript.model.Transcript;

public interface TranscriptRepository  extends JpaRepository<Transcript, Integer> {
    List<Transcript> findByStudentId(int syudentId);
}