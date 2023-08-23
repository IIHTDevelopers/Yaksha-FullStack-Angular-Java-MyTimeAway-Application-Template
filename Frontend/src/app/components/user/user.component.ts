import { Component } from '@angular/core';
import { LeaveService } from '../../services/leave.service';
import { Leave } from '../../models/leave.model';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  leaveForm!: FormGroup;
  leave: Leave = {
    id: 0,
    employeeName: '',
    employeePhone: '',
    managerEmail: '',
    fromDate: new Date(),
    toDate: new Date(),
    totalDays: 0,
    reason: '',
    status: '',
    employeeId: '',
    employeeEmail: '',
    isProcessed: false
  };

  constructor(private fb: FormBuilder, private leaveService: LeaveService, private router: Router) {
  }

  createForm() {
  }

  submitForm() {
  }
}
