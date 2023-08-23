package com.mytimeaway.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytimeaway.dto.EmployeeLeaveDTO;
import com.mytimeaway.entity.EmployeeLeave;
import com.mytimeaway.repo.EmployeeLeaveRepository;
import com.mytimeaway.service.EmployeeLeaveService;

@Service
public class EmployeeLeaveServiceImpl implements EmployeeLeaveService {

	@Autowired
	private EmployeeLeaveRepository leaveRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<EmployeeLeaveDTO> getAllLeaves() {
		return null;
	}

	@Override
	public EmployeeLeaveDTO getLeaveById(Long id) {
		return null;
	}

	@Override
	public EmployeeLeaveDTO createLeave(EmployeeLeaveDTO leaveDTO) {
		return null;
	}

	@Override
	public EmployeeLeaveDTO updateLeaveById(Long id, EmployeeLeaveDTO leaveDTO) {
		return null;
	}

	@Override
	public boolean deleteLeaveById(Long id) {
		return false;
	}

	@Override
	public List<EmployeeLeaveDTO> searchLeaves(String employeeId, String employeeName, Integer totalDays) {
		return null;
	}

	@Override
	public EmployeeLeaveDTO cancelLeaveRequest(Long id) {
		return null;
	}

	@Override
	public EmployeeLeaveDTO approveLeaveRequest(Long id) {
		return null;
	}

	@Override
	public EmployeeLeaveDTO rejectLeaveRequest(Long id) {
		return null;
	}

	private EmployeeLeaveDTO changeLeaveStatus(Long id, String newStatus) {
		return null;
	}

	private EmployeeLeaveDTO convertToDTO(EmployeeLeave leave) {
		return null;
	}

	private EmployeeLeave convertToEntity(EmployeeLeaveDTO leaveDTO) {
		return null;
	}
}
