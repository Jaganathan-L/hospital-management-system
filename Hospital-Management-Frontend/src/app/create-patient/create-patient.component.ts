import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { Doctor } from '../doctor'
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {

  patient: Patient = new Patient();
  doctorService: any;
  constructor(private patientService: PatientService,
    private router: Router) { }

  doctors: Doctor[] = [

  ];  

  ngOnInit(): void {
    this.getDoctors();
  }
  private getDoctors(){
    this.doctorService.getDoctorsList().subscribe((data: Doctor[]) => {
      this.doctors = data;
    });
  }

  savePatient(){
    this.patientService.createPatient(this.patient).subscribe( data =>{
      console.log(data);
      this.goToPatientList();
    },
    error => console.log(error));
  }

  goToPatientList(){
    this.router.navigate(['/patients']);
  }
  
  onSubmit(){
    console.log(this.patient);
    this.savePatient();
  }
}
