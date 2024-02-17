package com.lab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.exception.PatientNotFoundException;
import com.lab.model.PatientRecord;
import com.lab.repository.PatientRepository;
import com.lab.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public String createPatient(PatientRecord patientRecord) {
		// TODO Auto-generated method stub
		patientRepository.save(patientRecord);
		return "created";
	}

	@Override
	public String updatePatient(PatientRecord patientRecord) {
		// TODO Auto-generated method stub
		patientRepository.save(patientRecord);
		return "updated";
	}

	@Override
	public String deletePatient(int patientId) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(patientId);
		return "deleted";
	}

	@Override
	public PatientRecord getPatientRecord(int patientId) {
		// TODO Auto-generated method stub
		if(patientRepository.findById(patientId).isEmpty())
			throw new PatientNotFoundException("patient record "+ patientId +" not found");
		return patientRepository.findById(patientId).get();	
		
	}

	@Override
	public List<PatientRecord> getPatientRecordAll() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();	
	}

}
