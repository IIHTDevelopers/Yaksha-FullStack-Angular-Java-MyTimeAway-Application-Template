// leave-application.component.ts
import { Component } from '@angular/core';
import { LeaveService } from '../../services/leave.service';
import { LeaveApplication } from '../../models/leave-application.model';

@Component({
  selector: 'app-leave-application',
  templateUrl: './leave-application.component.html',
  styleUrls: ['./leave-application.component.css']
})
export class LeaveApplicationComponent {
  applicantName: string = '';
  startDate: string = '';
  endDate: string = '';

  constructor(private leaveService: LeaveService) { }

  submitForm() {

  }
}
