package com.bharath.app.controller;
import com.bharath.app.model.Hospital;
import com.bharath.app.model.Patient;
import com.bharath.app.repository.HospitalDataRepository;
import com.bharath.app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/message")

public class hospital {

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
