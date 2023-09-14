package com.bharath.com.controller;

import com.bharath.com.repository.HospitalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/message")

public class Hospital {

    @Autowired
    HospitalDataRepository hospitalDataRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Hospital> getAll() {
        return hospitalDataRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Hospital hospital) {
        hospitalDataRepository.save(hospital);
        return "saved";
    }
}
