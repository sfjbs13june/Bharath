package com.bharath.app.repository;

import com.bharath.app.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer>{
}
