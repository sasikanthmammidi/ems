package com.ci.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.ems.dao.EmployeeRepository;
import com.ci.ems.model.EmployeeDTO;
@Service
public class RegisterServiceImpl implements IRegisterService {
	
	@Autowired
    EmployeeRepository emprepo;
	
	public void register(EmployeeDTO empdto) {
		  System.out.println("Data creation started...");
		  
		  emprepo.save(empdto);
        
        System.out.println("Data creation complete..."+empdto.getEmpid());
	}

	@Override
	public List<EmployeeDTO> find() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);

		
	}

}
