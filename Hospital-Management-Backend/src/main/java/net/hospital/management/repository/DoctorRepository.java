package net.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.hospital.management.entity.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
