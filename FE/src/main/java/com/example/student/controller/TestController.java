package com.example.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String Gettestpage(Model model){
        model.addAttribute("testmassage", "Test 1 2 3");
        return "test";
    }
}
