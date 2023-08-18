// leave.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LeaveApplication } from '../models/leave-application.model';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {
  private apiUrl = 'http://localhost:8080/leave';

  constructor(private http: HttpClient) { }

  submitLeaveApplication(application: LeaveApplication): Observable<LeaveApplication> {
    return this.http.post<LeaveApplication>(`${this.apiUrl}`, application);
  }

  getAllLeaveApplications(): Observable<LeaveApplication[]> {
    return this.http.get<LeaveApplication[]>(`${this.apiUrl}`);
  }

  // Implement other methods for updating, canceling, searching, etc.
}
