package com.ci.ems.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ci.ems.model.EmployeeDTO;
import com.ci.ems.service.RegisterServiceImpl;
@RestController
public class EmsRegistrationController extends BaseEmsController {

	@Autowired
	public RegisterServiceImpl registerServiceImpl;

	@PostMapping(value = "/register")
	 public String registerEmployee( @RequestBody EmployeeDTO e)
	
	{
	    ArrayList<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();
	    employeeList.add(e);
		
		System.out.println("register employee service called");
		registerServiceImpl.register(e);
		return "data inserted";
	}
	
	@GetMapping(value = "/employees{empid}")
	@ResponseBody public String getEmployees(@PathVariable("empid") String empid)
	{
		System.out.println("get employee service called");
		 System.out.println(empid);
		//iLoginService.getEmployees();
		
		return "success";
	}
}
