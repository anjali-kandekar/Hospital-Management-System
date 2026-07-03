package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Patient;
import com.hospital.repository.PatientRepository;

@Service
public class PatientService 
{
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> getAllPatients()
	{
		return patientRepository.findAll();
	}
	
	public Optional<Patient> getPatientById(Long id)
	{
		return Optional.ofNullable(patientRepository.findById(id).orElseThrow());
	}
	
	public Patient savePatient(Patient patient)
	{
		return patientRepository.save(patient);
	}
	
}
