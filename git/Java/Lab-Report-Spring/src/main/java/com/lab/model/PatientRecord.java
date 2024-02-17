package com.lab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="patient")
public class PatientRecord {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	private String patientAge;
	private String patientGender;
	private String patientPhone;
	private String patientRefdoc;
	private String patientComment;
	private boolean patientArchieve;
	
	public PatientRecord() {
		//super();
	}

	public PatientRecord(int patientid, String patientName, String patientAge, String patientGender,
			String patientPhone, String patientRefdoc, String patientComment, boolean patientArchieve) {
	//	super();
		this.patientId = patientid;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientPhone = patientPhone;
		this.patientRefdoc = patientRefdoc;
		this.patientComment = patientComment;
		this.patientArchieve = patientArchieve;
	}
	
	
	public int getPatientid() {
		return patientId;
	}

	public void setPatientid(int patientid) {
		this.patientId = patientid;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	public String getPatientRefdoc() {
		return patientRefdoc;
	}

	public void setPatientRefdoc(String patientRefdoc) {
		this.patientRefdoc = patientRefdoc;
	}

	public String getPatientComment() {
		return patientComment;
	}

	public void setPatientComment(String patientComment) {
		this.patientComment = patientComment;
	}

	public boolean getPatientArchieve() {
		return patientArchieve;
	}

	public void setPatientArchieve(boolean patientArchieve) {
		this.patientArchieve = patientArchieve;
	}



}
