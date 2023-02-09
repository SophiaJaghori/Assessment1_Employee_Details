package com.cogent.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cogent.demo.utility.Employee;
@Repository
public class EmployeeRepo {
	public List<Employee>employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employee;
	}
	

}
