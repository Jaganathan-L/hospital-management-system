package net.hospital.management.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int doctor_id;
	
	@Column(name="doctor_name")
	private String name;
	
	@Column(name="doctor_age")
	private int age;
	
	@Column(name="doctor_gender")
	private String gender;
	
	@Column(name="doctor_specialistFields")
	private String specialistFields;

	public Doctor() {
		
	}
	public Doctor(int doctor_id, String name, int age, String gender,
			String specialistFields) {
		super();
		this.doctor_id = doctor_id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialistFields = specialistFields;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return name;
	}
	public void setDoctor_name(String name) {
		this.name = name;
	}
	public int getDoctor_age() {
		return age;
	}
	public void setDoctor_age(int age) {
		this.age = age;
	}
	public String getDoctor_gender() {
		return gender;
	}
	public void setDoctor_gender(String gender) {
		this.gender = gender;
	}
	public String getDoctor_specialistFields() {
		return specialistFields;
	}
	public void setDoctor_specialistFields(String specialistFields) {
		this.specialistFields = specialistFields;
	}
	
}
