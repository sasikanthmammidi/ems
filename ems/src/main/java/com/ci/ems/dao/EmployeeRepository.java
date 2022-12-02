package com.ci.ems.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ci.ems.model.EmployeeDTO;
@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDTO, String> {
    
    @Query("{name:'?0'}")
    EmployeeDTO findItemByName(String name);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<EmployeeDTO> findAll(String category);
    
    public long count();

}