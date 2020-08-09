package com.rebati.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebati.entity.SsnMaster;

public interface SsnMasterRepository extends JpaRepository<SsnMaster, Serializable>{

	public SsnMaster findBySsnNumberAndStateName(Long ssnNumber, String stateName);
}
