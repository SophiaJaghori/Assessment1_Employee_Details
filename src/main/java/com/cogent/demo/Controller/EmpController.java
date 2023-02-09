package com.cogent.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.demo.service.EmpService;
import com.cogent.demo.utility.Employee;

@RestController
@RequestMapping("/employee")
public class EmpController {
	@Autowired
	EmpService empService;
	@GetMapping("/get/all")
	public List<Employee>getAll(){
		return empService.getAll();
		
		
	}

}
