package com.leaveapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaveapplication.dto.LeaveApplicationDTO;
import com.leaveapplication.entity.LeaveApplication;
import com.leaveapplication.repo.LeaveApplicationRepository;
import com.leaveapplication.service.LeaveApplicationService;

@Service
public class LeaveApplicationServiceImpl implements LeaveApplicationService {

	@Autowired
	private LeaveApplicationRepository leaveApplicationRepository;

	public LeaveApplication createLeaveApplication(LeaveApplicationDTO leaveApplicationDTO) {
		return null;
	}

	public List<LeaveApplication> getAllLeaveApplications() {
		return null;
	}

	public LeaveApplication getLeaveApplicationById(Long id) {
		return null;
	}

	public LeaveApplication updateLeaveApplication(Long id, LeaveApplicationDTO updatedDTO) {
		return null;
	}

	public void cancelLeaveApplication(Long id) {
		// Implement cancelling a leave application
	}

	public List<LeaveApplication> searchLeaveApplications(String applicantName, String status) {
		return null;
	}

}
