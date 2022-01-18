package net.hospital.management.service;

import java.util.List;

import net.hospital.management.entity.Patient;



public interface PatientService {
	Patient createPatient(Patient patient);
	List<Patient> getAllPatients();
	Patient getpatientById(int patient_id);
	Patient updatePatient(Patient patient, int patient_id);
	void deletePatient(int patient_id);
}
