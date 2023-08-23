package com.mytimeaway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytimeaway.service.EmployeeLeaveService;

@RestController
@RequestMapping("/api/leaves")
public class EmployeeLeaveController {

	@Autowired
	private EmployeeLeaveService leaveService;

}
