package com.bharath.app.repository;

import com.bharath.app.model.Hospital;
import com.bharath.app.model.Patient;
import org.springframework.Data.repository.CrudRepository;

import java.util.UUID;

public interface HospitalDataRepository extends CrudRepository <Hospital, Integer> {

 }

