package com.bharath.com.repository;

import com.bharath.app.model.Hospital;
import org.springframework.Data.repository.CrudRepository;

public interface HospitalDataRepository extends CrudRepository <Hospital, Integer> {

 }

