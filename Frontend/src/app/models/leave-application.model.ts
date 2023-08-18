// leave-application.dto.ts
export interface LeaveApplication {
    id: number;
    employeeID: number;
    employeeName: string;
    employeeEmail: string;
    managerEmail: string;
    startDate: string;
    endDate: string;
    reason:string;
    status: string;
  }
  