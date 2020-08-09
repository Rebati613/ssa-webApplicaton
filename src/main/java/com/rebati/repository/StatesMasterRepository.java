package com.rebati.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rebati.entity.StatesMaster;

public interface StatesMasterRepository extends JpaRepository<StatesMaster, Serializable>{

	@Query(value = "select stateName from StatesMaster")
	public List<String> findStateNames();
}
