package com.ci.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ci.ems.model.EmployeeDTO;
import com.ci.ems.service.ILoginService;
import com.ci.ems.service.IRegisterService;
import com.ci.ems.service.RegisterServiceImpl;
@RestController
public class EmsRegistrationController extends BaseEmsController {

	@Autowired
	public IRegisterService iRegisterService;
	@Autowired
	public RegisterServiceImpl RegisterServiceImpl;

	@PostMapping(value = "/register")
	@ResponseBody public String registerEmployee(EmployeeDTO e)
	
	{
		iRegisterService.register(e);
		
		return "success";
	}
	
	@GetMapping(value = "/employees")
	@ResponseBody public String getEmployee()
	{
		System.out.println("service called");
		//iLoginService.getEmployees();
		
		return "success";
	}
}
