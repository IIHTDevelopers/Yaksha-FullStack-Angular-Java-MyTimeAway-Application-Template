// leave-consumer.component.ts
import { Component } from '@angular/core';
import { LeaveService } from '../../services/leave.service';
import { LeaveApplication } from '../../models/leave-application.model';

@Component({
  selector: 'app-leave-consumer',
  templateUrl: './leave-consumer.component.html',
  styleUrls: ['./leave-consumer.component.css']
})
export class LeaveConsumerComponent {
  leaveApplications: LeaveApplication[] = [];

  constructor(private leaveService: LeaveService) { }

  loadLeaveApplications() {

  }
}
