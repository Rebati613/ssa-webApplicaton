package com.rebati.service;

import java.util.List;

import com.rebati.model.SsnEnrollmentRequest;

public interface SsnService {

	public List<String> getAllStatesName();
	
	public Long ssnEnrollment(SsnEnrollmentRequest req);
	
	public String checkEnrollment(Long ssnNumber,String stateName);
	
}
