package com.cogent.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.demo.repository.EmployeeRepo;
import com.cogent.demo.utility.Employee;
@Service
public class EmpService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<Employee>getAll() {
		// TODO Auto-generated method stub
		return employeeRepo.getAll();
	}

	

}
