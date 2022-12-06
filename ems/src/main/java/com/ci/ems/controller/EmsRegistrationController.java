package com.ci.ems.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping(value = "/employees")
	@ResponseBody public List<EmployeeDTO> getEmployees()
	{
	    List<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();

		System.out.println("get employee service called");
		employeeList=registerServiceImpl.find();
		//iLoginService.getEmployees();
		
		return employeeList;
	}
	
	@DeleteMapping("/deleteemployee/{id}")
    public String deleteBook(@PathVariable int id){
		registerServiceImpl.deleteEmployee(id);
        
        return "Deleted Successfully";
    }
	
	
}
