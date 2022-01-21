import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Doctor } from './doctor';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  doctor: Doctor[] = [

  ];

  private url = "http://localhost:9090/doctors";

  constructor(private httpClient: HttpClient,
    private http: HttpClient) { }
  
  getDoctorsList(): Observable<Doctor[]>{
    return this.httpClient.get<Doctor[]>(`${this.url}`);
    // return this.http.get<Doctor[]>(this.url);
  }

  createDoctor(doctor: Doctor): Observable<Object>{
    return this.httpClient.post(`${this.url}`, doctor);
    // return this.http.post<Doctor>(this.url, doctor);
  }

  getDoctorById(id: number): Observable<Doctor>{
    // return this.httpClient.get<Doctor>(`${this.url}/${id}`);
    return this.http.get<Doctor>(this.url + '/' + id);
  }

  updateDoctor(id: number, doctor: Doctor): Observable<Object>{
    return this.httpClient.put(`${this.url}/${id}`, doctor);
    // return this.http.put<Doctor>(this.url + '/' + id, doctor);
  }

  deleteDoctor(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.url}/${id}`);
  }

}



















