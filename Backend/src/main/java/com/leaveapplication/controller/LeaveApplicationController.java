package com.leaveapplication.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leaveapplication.entity.LeaveApplication;
import com.leaveapplication.dto.LeaveApplicationDTO;
import com.leaveapplication.service.LeaveApplicationService;

@RestController
@RequestMapping("/leave")
@CrossOrigin
public class LeaveApplicationController {

	@Autowired
	private LeaveApplicationService leaveApplicationService;

	@PostMapping
	public ResponseEntity<LeaveApplicationDTO> submitLeaveApplication(
			@RequestBody LeaveApplicationDTO leaveApplicationDTO) {
		LeaveApplication leaveApplication = leaveApplicationService.createLeaveApplication(leaveApplicationDTO);
		return new ResponseEntity<>(convertToDTO(leaveApplication), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<LeaveApplicationDTO>> getAllLeaveApplications() {
		List<LeaveApplication> leaveApplications = leaveApplicationService.getAllLeaveApplications();
		List<LeaveApplicationDTO> dtoList = leaveApplications.stream().map(this::convertToDTO)
				.collect(Collectors.toList());
		return new ResponseEntity<>(dtoList, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<LeaveApplicationDTO> getLeaveApplication(@PathVariable Long id) {
		LeaveApplication leaveApplication = leaveApplicationService.getLeaveApplicationById(id);
		return new ResponseEntity<>(convertToDTO(leaveApplication), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<LeaveApplicationDTO> updateLeaveApplication(@PathVariable Long id,
			@RequestBody LeaveApplicationDTO updatedDTO) {
		LeaveApplication updatedApplication = leaveApplicationService.updateLeaveApplication(id, updatedDTO);
		return new ResponseEntity<>(convertToDTO(updatedApplication), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> cancelLeaveApplication(@PathVariable Long id) {
		leaveApplicationService.cancelLeaveApplication(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/search")
	public ResponseEntity<List<LeaveApplicationDTO>> searchLeaveApplications(
			@RequestParam(required = false) String applicantName, @RequestParam(required = false) String status) {
		List<LeaveApplication> leaveApplications = leaveApplicationService.searchLeaveApplications(applicantName,
				status);
		List<LeaveApplicationDTO> dtoList = leaveApplications.stream().map(this::convertToDTO)
				.collect(Collectors.toList());
		return new ResponseEntity<>(dtoList, HttpStatus.OK);
	}

	private LeaveApplicationDTO convertToDTO(LeaveApplication leaveApplication) {
		return null;
	}
}
