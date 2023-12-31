package com.bharath.app.controller;

import com.bharath.app.model.Patient;
import com.bharath.app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/patient")
public class patient {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable <Patient> getAll() {
        return patientRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Patient patient) {
        patientRepository.save(patient);
        return "saved";
    }

    @DeleteMapping(value = "/delete")
    public @ResponseBody
    String store(@RequestParam("id") final int id) {
        patientRepository.deleteById(id);
        return "deleted";
    }
}
