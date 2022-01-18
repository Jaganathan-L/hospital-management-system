package net.hospital.management.entity;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import net.hospital.management.HospitalManagementApplication;
import net.hospital.management.entity.Doctor;
import net.hospital.management.repository.DoctorRepository;
import net.hospital.management.repository.PatientRepository;
import net.hospital.management.service.DoctorService;
import net.hospital.management.service.PatientService;


@SpringBootTest(classes=HospitalManagementApplication.class)
class DemoApplicationTests {
	

	@Autowired
	private DoctorService doctorService;
	
	@MockBean
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientService patientService;
	
	@MockBean
	private PatientRepository patientrepository;
	
	@Test
	public void getAllDoctorsTest() {
		when(doctorRepository.findAll()).thenReturn(Stream.of(new Doctor(1,"Dr.N.Srinivasan",36,"M","Orthologist"),new Doctor(2,"Dr.M.Chandrasekar",58,"M","Nephralogist"),new Doctor(3,"Dr.K.Saraswathi",34,"F","Pediatrician")).collect(Collectors.toList()));
		
	assertEquals(3,(doctorService.getAllDoctors()).size());
	}
	
	@Test
	public void getdoctorByIdTest() {
		int doctor_id=1;
		Optional<Doctor> optionalEntity=Optional.of(new Doctor(1,"Dr.N.Srinivasan",36,"M","Orthologist"));
		when(doctorRepository.findById(doctor_id)).thenReturn(optionalEntity);
		assertEquals(36,(doctorService.getdoctorById(doctor_id)).getDoctor_age());
	}
	
	@Test
	public void createDoctorTest() {
		Doctor doctor=new Doctor(4,"Dr.S.Wilson",47,"M","Cardiologist");
		when(doctorRepository.save(doctor)).thenReturn(doctor);
		assertNotNull((Doctor)doctorService.createDoctor(doctor));
	}
	
	
	@Test
	public void deleteDoctorTest() {
		doctorRepository.deleteById(2103);
		verify(doctorRepository,times(1)).deleteById(2103);
	}
	
	@Test
	public void getAllPatientsTest() {
		when(patientrepository.findAll()).thenReturn(Stream.of(new Patient(3101,"Stacey Kristen","Dr Tuco Salamanca",new Date()),new Patient(3102,"Hana Albers","Dr.Kim Wexler",new Date()),new Patient(3103,"Lalo Esperoncias","Dr Tuco Salamanca",new Date())).collect(Collectors.toList()));
		
	assertEquals(3,(patientService.getAllPatients()).size());
	}
	
	@Test
	public void getpatientByIdTest() {
		int patient_id=3101;
		Optional<Patient> optionalEntity=Optional.of(new Patient(3101,"Stacey Kristen","Dr Tuco Salamanca",new Date()));
		when(patientrepository.findById(patient_id)).thenReturn(optionalEntity);
		assertEquals(3101,(patientService.getpatientById(patient_id).getPatient_id()));
	}
	
	@Test
	public void deletePatientTest() {
		patientrepository.deleteById(3103);
		verify(patientrepository,times(1)).deleteById(3103);

	}
	
	@Test
	public void createPatientTest() {
		Patient patient=new Patient(3104,"Kailey Matt","Dr. Mike Ermantraut",new Date());
		when(patientrepository.save(patient)).thenReturn(patient);
		assertNotNull((Patient)patientService.createPatient(patient));
	}
}


