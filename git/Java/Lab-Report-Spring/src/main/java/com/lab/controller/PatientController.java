package com.lab.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.model.PatientRecord;
import com.lab.response.ResponseHandler;
import com.lab.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	

	PatientService patientService;
	
	
	public PatientController(PatientService patientService) {
		//super();
		this.patientService = patientService;
	}

	

	@GetMapping("{patientId}")
	public ResponseEntity<Object> getPatientDetails(@PathVariable("patientId") int patientId)
	{
		return ResponseHandler.responseBuilder("Patient details here", 
				HttpStatus.OK,patientService.getPatientRecord(patientId) ) ;
		
	}
	
	@GetMapping()
	public List<PatientRecord> getAllPatientDetails()
	{
		
		return patientService.getPatientRecordAll();
		
	}
	
	@PostMapping
	public String createPatientDetails(@RequestBody PatientRecord patientRecord)
	{
		
		patientService.createPatient(patientRecord);
		return "Patient record created succesfully";
		
	}
	
	@PutMapping
	public String updatePatientDetails(@RequestBody PatientRecord patientRecord)
	{
		
		patientService.updatePatient(patientRecord);
		return "Patient record updated succesfully";
		
	}
	
	@DeleteMapping("{patientId}")
	public String deletePatientDetails(@PathVariable("patientId")int patientId)
	{
		patientService.deletePatient(patientId);
		return "Patient record deleted succesfully";
		
	}

}
