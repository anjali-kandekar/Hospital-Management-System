package com.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor_info")
public class Doctor 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long doctorId;
	@Column(name="Doctor_Name")
	private String doctorName;
	@Column(name="Doctor_Specialization")
	private String doctorSpec;
	@Column(name="Doctor_Experience")
	private int doctorExp;
	
	public Doctor() 
	{
		
	}

	public Doctor(Long doctorId, String doctorName, String doctorSpec, int doctorExp) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorSpec = doctorSpec;
		this.doctorExp = doctorExp;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
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

	public int getDoctorExp() {
		return doctorExp;
	}

	public void setDoctorExp(int doctorExp) {
		this.doctorExp = doctorExp;
	}
	
	
	

}
