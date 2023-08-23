import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Leave } from '../models/leave.model';

@Injectable({
    providedIn: 'root'
})
export class LeaveService {
    private baseUrl = '';

    constructor() { }

    getAllLeaves(): any {
        return null;
    }

    getLeaveById(id: number): any {
        return null;
    }

    createLeave(leave: Leave): any {
        return null;
    }

    updateLeaveById(id: number, leave: Leave): any {
        return null;
    }

    deleteLeaveById(id: number): any {
        return null;
    }

    searchLeaves(employeeId?: string, employeeName?: string, totalDays: number = 0): any {
        return null;
    }

    cancelLeaveRequest(id: number): any {
        return null;
    }

    approveLeaveRequest(id: number): any {
        return null;
    }

    rejectLeaveRequest(id: number): any {
        return null;
    }
}
