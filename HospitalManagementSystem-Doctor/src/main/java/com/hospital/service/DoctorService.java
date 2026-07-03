package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospital.entity.Doctor;
import com.hospital.repository.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService 
{
	@Autowired
	private DoctorRepository doctorRepository;
	
	public List<Doctor> getAllDoctors()
	{
		return doctorRepository.findAll();
	}
	
	public Doctor saveDoctor(Doctor doctor)
	{
		return doctorRepository.save(doctor);
	}
	
	public List<Doctor> getAllDocBySpec(String spec)
	{
		return doctorRepository.getAllDoctorBySpec(spec);
	}
	
	public Doctor getDocBySpec(String spec)
	{
		return doctorRepository.getDistinctDoctorBySpec(spec);
	}

}
