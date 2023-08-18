package com.leaveapplication.service;

import java.util.List;

import com.leaveapplication.dto.LeaveApplicationDTO;
import com.leaveapplication.entity.LeaveApplication;

public interface LeaveApplicationService {

	public LeaveApplication createLeaveApplication(LeaveApplicationDTO leaveApplicationDTO);

	public List<LeaveApplication> getAllLeaveApplications();

	public LeaveApplication getLeaveApplicationById(Long id);

	public LeaveApplication updateLeaveApplication(Long id, LeaveApplicationDTO updatedDTO);

	public void cancelLeaveApplication(Long id);

	public List<LeaveApplication> searchLeaveApplications(String applicantName, String status);

}