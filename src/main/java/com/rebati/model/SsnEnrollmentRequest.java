package com.rebati.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class SsnEnrollmentRequest {
	
	private String firstName;

	private String lastName;
	
	private String gender;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	private String stateName;
	
	

}
