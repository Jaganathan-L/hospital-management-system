package net.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.hospital.management.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
