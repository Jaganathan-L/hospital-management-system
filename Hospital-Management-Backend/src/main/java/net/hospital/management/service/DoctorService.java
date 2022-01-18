package net.hospital.management.service;

import java.util.List;

import net.hospital.management.entity.Doctor;



public interface DoctorService {
	Doctor createDoctor(Doctor doctor);
	List<Doctor> getAllDoctors();
	Doctor getdoctorById(int doctor_id);
	Doctor updateDoctor(Doctor doctor, int doctor_id);
	void deleteDoctor(int doctor_id);
}
