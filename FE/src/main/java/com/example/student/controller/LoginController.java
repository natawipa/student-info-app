package com.example.student.controller;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.student.model.Student;
import com.example.student.service.StudentService;
import com.example.student.service.TranscriptService;

@Controller
@RequestMapping("/login")
public class LoginController {

    private StudentService studentService;
    private TranscriptService transcriptService;
    public LoginController(StudentService studentService, TranscriptService transcriptService) {
        this.studentService = studentService;
        this.transcriptService = transcriptService;
    }

    @GetMapping
    public String getLoginPage(Model model) {
          return "login";
    }
    @PostMapping
    public String login(@ModelAttribute Student std, Model model) {

        // 1. check id and pin
        Optional<Student> matchingStudent = studentService.checkPsw(std);
         // 2. if match, login success
        if (matchingStudent != null) {
            model.addAttribute("greeting",
                    "SIS: Welcome " + matchingStudent.get().getName());
            std.setPsw("");
            std.setName(matchingStudent.get().getName());

            model.addAttribute("studentmessage",
                    std.getName() + ": Transcripts");
            model.addAttribute("alltranscripts", transcriptService.getTranscripts(std.getId()));
            return "transcript";
        } else {
            // 3.if not match, fail to login
            model.addAttribute("greeting", "SIS: Student not logged in");
        }
        return "home";
    }
}


