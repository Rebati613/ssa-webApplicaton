package com.rebati.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rebati.model.SsnEnrollmentRequest;
import com.rebati.service.SsnService;

@RestController
public class SsnEnrollmentRestController {
	
	@Autowired
	private SsnService service;
	
	@PostMapping(value = "/ssnEnroll",
				 consumes = "application/json")
	public ResponseEntity<String> enroll(@RequestBody SsnEnrollmentRequest request){
		ResponseEntity<String> response = null;
		Long ssn = service.ssnEnrollment(request);
		
		String body = "SSN enrollment complete successfully.Yor SSN is : "+ssn;
		
		response = new ResponseEntity<>(body,HttpStatus.CREATED);
		return response;
	}

}
