package com.bharath.app.controller;

import com.bharath.app.model.hospital;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

public class hospitalcontroller {

    Map<String,hospital> studentMap= new HashMap<String,hospital>();

    @PostMapping("/create")
    public hospital createStudent(@RequestBody hospital student){
        studentMap.put(student.getPatientName(),student);
        return student;
    }

    @GetMapping("/read")
    public hospital readeStudent(@RequestParam("name") String name){
        return studentMap.get(name);
    }

    @PutMapping("/update")
    public hospital updateStudent(@RequestParam("name") String name,@RequestParam("age") int age){
        hospital student= studentMap.get(name);
        student.setAge(age);
        studentMap.put(name,student);
        return student;
    }

    @DeleteMapping("/delete")
    public void deleteStudent(@RequestParam("name") String name){
        studentMap.remove(name);
    }

    @GetMapping("/read/{name}")
    public hospital ReadNameStudent(@PathVariable String name){
        return studentMap.get(name);
    }

}
