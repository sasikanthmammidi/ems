package com.ci.ems.dao;

import org.springframework.stereotype.Repository;

import com.ci.ems.model.EmployeeDTO;
@Repository
public interface iRegisterDAO {
public void save(EmployeeDTO employeeDTO);


}