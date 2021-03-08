package com.hteiktan.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;



import com.hteiktan.dto.EmployeeDTO;


public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	List<EmployeeDTO> employee = null;
	
	@PostConstruct
	public void initializer() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(101);
		employeeDTO.setEmpName("Jack");
		employeeDTO.setDepartment("ETA");
		employee = new ArrayList<EmployeeDTO>();
		employee.add(employeeDTO);
	}
	
	public void insertEmployee(EmployeeDTO emp) {
		employee.add(emp);
	}
	
	public void removeEmployee(int empId) {
		employee.remove(empId);
	}


	public List<EmployeeDTO> fetchEmployee() {
		// TODO Auto-generated method stub
		return employee;
	}
}

