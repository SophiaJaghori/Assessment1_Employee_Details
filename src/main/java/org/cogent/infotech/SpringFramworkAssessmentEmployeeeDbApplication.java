package org.cogent.infotech;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.demo.repository.EmployeeRepo;
import com.cogent.demo.utility.Employee;

@SpringBootApplication
public class SpringFramworkAssessmentEmployeeeDbApplication implements CommandLineRunner {
	
	@Autowired
	EmployeeRepo empRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringFramworkAssessmentEmployeeeDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1100, "Joe",1230.9);
		Employee e2 = new Employee(1110, "Emily",1534.5);
		Employee e3 = new Employee(1120, "John",1145.45);
		System.out.println(empRepository.employee.addAll(Arrays.asList(e1,e2,e3)));
		
	}

}
