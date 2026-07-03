package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Doctor;
import com.hospital.service.DoctorService;

@RestController
public class DoctorController 
{
	@Autowired
	private DoctorService doctorservice;
	
	@GetMapping("/allDoctors")
	public List<Doctor> fetchAllDoctors()
	{
		return doctorservice.getAllDoctors();
	}
	@PostMapping("/addDoctor")
	public Doctor insertDoctor( @RequestBody Doctor doctor)
	{
		return doctorservice.saveDoctor(doctor);
	}
	
	@GetMapping("/allDoctors/{spec}")
	public List<Doctor> fetchAllDoctorBySpec(@PathVariable String spec)
	{
		return doctorservice.getAllDocBySpec(spec);
	}
	
	@GetMapping("/fetchDoctor/{spec}")
	public Doctor fetchDoctorBySpec(@PathVariable String spec)
	{
		return doctorservice.getDocBySpec(spec);
	}
	

	
}
