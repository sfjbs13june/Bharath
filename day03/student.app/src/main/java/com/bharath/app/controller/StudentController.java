package com.bharath.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/getstudent")

    public String getstudentDetails() {
        return "student1";
    }

    @PutMapping("/updatestudent")
    public String putstudentDetails(){
        return "updated student1";
    }

    @DeleteMapping("/deletedstudent")
    public String deletestudentDetails(){
        return "deleted student1";
    }
}