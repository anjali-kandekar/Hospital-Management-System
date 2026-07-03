package com.hospital.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hospital.entity.Doctor;
import com.hospital.entity.Patient;
import com.hospital.service.PatientService;


@RestController
public class PatientController 
{
	@Autowired
	private PatientService patientService;
	@Autowired
	private DiscoveryClient client;
	
	@GetMapping("/allPatients")
	public List<Patient> fetchAllPatients()
	{
		return patientService.getAllPatients();
	}
	
	@GetMapping("/patient/{id}")
	public Optional<Patient> fetchPatientById(@PathVariable Long id)
	{
		return patientService.getPatientById(id);
	}
	
	@PostMapping("/registerPatient/{spec}")
	public Patient insertPatient(@RequestBody Patient patient,@PathVariable String spec)
	{
		 List<ServiceInstance> services = client.getInstances("HospitalManagementSystem-Doctor");
		 
		 ServiceInstance service = services.get(0);
		 
		 URI uri = service.getUri();//localhost:1008
		 
		 Doctor doctor = new RestTemplate().getForObject(uri+"/fetchDoctor/"+spec, Doctor.class);
		 
		 patient.setDoctorName(doctor.getDoctorName());
		 patient.setDoctorSpec(doctor.getDoctorSpec());
		 patient.setDoctorExp(doctor.getDoctorExp());
		
		
		return patientService.savePatient(patient);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
