package com.example.transcript.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.transcript.data.TranscriptRepository;
import com.example.transcript.model.Transcript;

@RestController
@RequestMapping("/api/transcript")
public class TranscriptController {
    private TranscriptRepository repository;
    public TranscriptController(TranscriptRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<Transcript> getAll() {
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Transcript getOne(@PathVariable int id) {
        return repository.findById(id).get();
    } 
   @GetMapping("/student/{id}")
    public List<Transcript> getAllTranscripts(@PathVariable int id) {
        return repository.findByStudentId(id);
    }
   @PostMapping
    public Transcript create(@RequestBody Transcript transcript){
        repository.save(transcript);
        System.out.println(transcript.getTranId());
        return repository.findById(transcript.getTranId()).get();
    }
    @PutMapping("/{id}")
    public Transcript update(@PathVariable int id,
                         @RequestBody Transcript transcript) {
                            Transcript record = repository.findById(id).get();
        record.setGPA(transcript.getGPA());
        repository.save(record);
        return record;
    }
    @DeleteMapping("/{id}")
    public Transcript delete(@PathVariable int id) {
        Transcript record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}