package com.hospital.entity;

public class Doctor 
{
    private Long doctorId;
    private String doctorName;
    private String doctorSpec;
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

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorSpec=" + doctorSpec
				+ ", doctorExp=" + doctorExp + "]";
	}
	
	
    
    
}
