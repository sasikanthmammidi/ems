package com.ci.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ci.ems.model.EmployeeDTO;
@Service
public interface IRegisterService {
	public void register(EmployeeDTO empdto);
	public List<EmployeeDTO> find();
	public void deleteEmployee(int id);

}
