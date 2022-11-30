package com.ci.ems.service;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoClientFactory;
import org.springframework.stereotype.Service;

import com.ci.ems.dao.RegisterDAO;
import com.ci.ems.model.EmployeeDTO;
@Service
public class RegisterServiceImpl implements IRegisterService {
	
	@Autowired
	RegisterDAO registerDAO;
	
	public void register(EmployeeDTO empdto) {
//		Connection connectionString = new Connection("mongodb+srv://admin:admin@cluster0.ftc2xdw.mongodb.net/?retryWrites=true&w=majority");
//		MongoClientSettings settings = MongoClientSettings.builder()
//		        .applyConnectionString(connectionString)
//		        .build();
//		MongoClient mongoClient = MongoClientFactory.create(settings);
//		MongoDatabase database = mongoClient.getDatabase("test");
	}

}
