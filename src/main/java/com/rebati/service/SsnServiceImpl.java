package com.rebati.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rebati.entity.SsnMaster;
import com.rebati.model.SsnEnrollmentRequest;
import com.rebati.repository.SsnMasterRepository;
import com.rebati.repository.StatesMasterRepository;

@Service
public class SsnServiceImpl implements SsnService {

	@Autowired
	StatesMasterRepository stateRepo;
	
	@Autowired
	SsnMasterRepository ssnRepo;
	
	@Override
	public List<String> getAllStatesName() {
		
		return stateRepo.findStateNames();
	}

	@Override
	public Long ssnEnrollment(SsnEnrollmentRequest req) {
		SsnMaster entity = new SsnMaster();
		BeanUtils.copyProperties(req, entity);
		SsnMaster savedEntity = ssnRepo.save(entity);
		if(savedEntity!=null) {
			return savedEntity.getSsnNumber();
		}
		return null;
	}

	@Override
	public String checkEnrollment(Long ssnNumber, String stateName) {
		SsnMaster entity = ssnRepo.findBySsnNumberAndStateName(ssnNumber, stateName);
		if(entity!=null) {
			return "VALID";
		}
		return "IN-VALID";
	}

}
