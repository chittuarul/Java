package com.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.model.PatientRecord;
@Repository
public interface PatientRepository extends JpaRepository<PatientRecord, Integer>{

}
