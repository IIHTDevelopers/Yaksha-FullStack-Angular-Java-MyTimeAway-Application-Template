package com.leaveapplication.utils;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leaveapplication.dto.LeaveApplicationDTO;
import com.leaveapplication.entity.LeaveApplication;

public class MasterData {
	public static LeaveApplicationDTO getLeaveApplicationDTO() {
		LeaveApplicationDTO leaveApplicationDTO = new LeaveApplicationDTO();
		leaveApplicationDTO.setId(1L);
		leaveApplicationDTO.setEmployeeID(1L);
		leaveApplicationDTO.setEmployeeName("John Doe");
		leaveApplicationDTO.setEmployeeEmail("john.doe@example.com");
		leaveApplicationDTO.setManagerEmail("manager@example.com");
		leaveApplicationDTO.setStartDate("2023-8-1");
		leaveApplicationDTO.setEndDate("2023-8-5");
		leaveApplicationDTO.setReason("Vacation");
		leaveApplicationDTO.setStatus("Pending");
		return leaveApplicationDTO;
	}

	public static List<LeaveApplicationDTO> getLeaveApplicationDTOList() {
		List<LeaveApplicationDTO> leaveApplicationDTOS = new ArrayList<>();

		LeaveApplicationDTO leaveApplicationDTO = new LeaveApplicationDTO();
		leaveApplicationDTO.setId(1L);
		leaveApplicationDTO.setEmployeeID(1L);
		leaveApplicationDTO.setEmployeeName("John Doe");
		leaveApplicationDTO.setEmployeeEmail("john.doe@example.com");
		leaveApplicationDTO.setManagerEmail("manager@example.com");
		leaveApplicationDTO.setStartDate("2023-8-1");
		leaveApplicationDTO.setEndDate("2023-8-15");
		leaveApplicationDTO.setReason("Vacation");
		leaveApplicationDTO.setStatus("Pending");
		leaveApplicationDTOS.add(leaveApplicationDTO);

		leaveApplicationDTO = new LeaveApplicationDTO();
		leaveApplicationDTO.setId(2L);
		leaveApplicationDTO.setEmployeeID(2L);
		leaveApplicationDTO.setEmployeeName("Jane Smith");
		leaveApplicationDTO.setEmployeeEmail("jane.smith@example.com");
		leaveApplicationDTO.setManagerEmail("manager@example.com");
		leaveApplicationDTO.setStartDate("2023-8-1");
		leaveApplicationDTO.setEndDate("2023-8-15");
		leaveApplicationDTO.setReason("Sick Leave");
		leaveApplicationDTO.setStatus("Approved");
		leaveApplicationDTOS.add(leaveApplicationDTO);

		return leaveApplicationDTOS;
	}

	public static LeaveApplication getLeaveApplication() {
		LeaveApplication leaveApplication = new LeaveApplication();
		leaveApplication.setId(1L);
		leaveApplication.setEmployeeID(1L);
		leaveApplication.setEmployeeName("John Doe");
		leaveApplication.setEmployeeEmail("john.doe@example.com");
		leaveApplication.setManagerEmail("manager@example.com");
		leaveApplication.setStartDate("2023-8-1");
		leaveApplication.setEndDate("2023-8-5");
		leaveApplication.setReason("Vacation");
		leaveApplication.setStatus("Pending");
		return leaveApplication;
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
