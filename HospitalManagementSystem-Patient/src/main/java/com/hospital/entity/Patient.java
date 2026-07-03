package com.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_info")
public class Patient 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long patientId;
	@Column(name="Patient_Name")
	private String patientName;
	@Column(name="Patient_Address")
	private String patientAddress;
	@Column(name="Patient_Issue")
	private String patientIssue;
	@Column(name="Doctor_Name")
	private String doctorName;
	@Column(name="Doctor_Specialization")
	private String doctorSpec;
	@Column(name="Doctor_Experience")
	private Integer doctorExp;
	
	public Patient() 
	{
		
	}

	public Patient(Long patientId, String patientName, String patientAddress, String patientIssue, String doctorName,
			String doctorSpec, Integer doctorExp) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientIssue = patientIssue;
		this.doctorName = doctorName;
		this.doctorSpec = doctorSpec;
		this.doctorExp = doctorExp;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientIssue() {
		return patientIssue;
	}

	public void setPatientIssue(String patientIssue) {
		this.patientIssue = patientIssue;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpec() {
		return doctorSpec;
	}

	public void setDoctorSpec(String doctorSpec) {
		this.doctorSpec = doctorSpec;
	}

	public Integer getDoctorExp() {
		return doctorExp;
	}

	public void setDoctorExp(Integer doctorExp) {
		this.doctorExp = doctorExp;
	}

	
	
	

	
}
