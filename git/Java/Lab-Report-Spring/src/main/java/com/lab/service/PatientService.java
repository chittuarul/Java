package com.lab.service;

import java.util.List;

import com.lab.model.PatientRecord;

public interface PatientService {

	
	public String createPatient(PatientRecord patientRecord);
	public String updatePatient(PatientRecord patientRecord);
	public String deletePatient(int patientId);
	public PatientRecord getPatientRecord(int patientId);
	public List<PatientRecord> getPatientRecordAll();
	}
