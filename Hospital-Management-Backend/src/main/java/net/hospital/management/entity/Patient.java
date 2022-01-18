package net.hospital.management.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patient_id;
	
	@Column(name="patient_name")
	private String name;
	
	@Column(name="Patient_visitedDoctor")
	private String Patient_visitedDoctor;
	
	@Column(name="patient_dateOfVisit")
	private Date dateOfVisit;
	
	
	public Patient() {
		
	}
	
	public Patient(int patient_id, String name, String visitedDoctor, Date dateOfVisit) {
		super();
		this.patient_id = patient_id;
		this.name = name;
		this.Patient_visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return name;
	}
	public void setPatient_name(String name) {
		this.name = name;
	}
	public String getPatient_visitedDoctor() {
		return Patient_visitedDoctor;
	}
	public void setPatient_visitedDoctor(String visitedDoctor) {
		this.Patient_visitedDoctor = visitedDoctor;
	}
	public Date getPatient_dateOfVisit() {
		return dateOfVisit;
	}
	public void setPatient_dateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
}
