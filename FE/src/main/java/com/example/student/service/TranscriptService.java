package com.example.student.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.student.model.Transcript;

@Service
public class TranscriptService {
    private RestTemplate restTemplate;
        public TranscriptService(RestTemplate restTemplate) {
            this.restTemplate = restTemplate;
        }

        public List<Transcript> getTranscripts(int studentId) {
            String url = "http://localhost:8090/api/transcript/student/" + studentId;
            ResponseEntity<Transcript[]> response = restTemplate.getForEntity(url, Transcript[].class);
            Transcript[] transcripts = response.getBody();
            return Arrays.asList(transcripts);
        }

}