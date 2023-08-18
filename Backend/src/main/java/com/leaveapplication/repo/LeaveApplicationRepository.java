package com.leaveapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leaveapplication.entity.LeaveApplication;

public interface LeaveApplicationRepository extends JpaRepository<LeaveApplication, Long> {

}
