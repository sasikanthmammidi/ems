package com.ci.ems.service;

import org.springframework.stereotype.Service;

import com.ci.ems.model.EmployeeDTO;
@Service
public interface IRegisterService {
	public void register(EmployeeDTO empdto);
	
}
