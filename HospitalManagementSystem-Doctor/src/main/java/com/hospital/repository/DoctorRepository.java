package com.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long>
{
	@Query("select d from Doctor d where d.doctorSpec=?1")
	public List<Doctor> getAllDoctorBySpec(String spec);
	
	@Query("select distinct d from Doctor d where d.doctorSpec=?1")
	public Doctor getDistinctDoctorBySpec(String spec);
}
