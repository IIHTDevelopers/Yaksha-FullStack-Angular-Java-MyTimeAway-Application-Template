import { Component, OnInit } from '@angular/core';
import { LeaveService } from '../../services/leave.service';
import { Leave } from '../../models/leave.model';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  leaveApplications: Leave[] = [];

  constructor(private leaveService: LeaveService) { }

  ngOnInit() {
  }

  fetchLeaveApplications() {
  }

  cancelLeave(application: Leave) {
  }

  approveLeave(application: Leave) {
  }
}
