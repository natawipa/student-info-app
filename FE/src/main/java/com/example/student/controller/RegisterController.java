package com.example.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.student.model.Student;
import com.example.student.service.StudentService;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private StudentService studentService;

    public RegisterController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping
    public String getRegisterPage(Model model) {
        model.addAttribute("allStudents", studentService.getStudents());
        return "register";
    }
    @PostMapping
    public String registerStudent(@ModelAttribute Student student, Model model) {
        studentService.createStudent(student);
        model.addAttribute("allStudents", studentService.getStudents());
        return "redirect:register";
    }
}
