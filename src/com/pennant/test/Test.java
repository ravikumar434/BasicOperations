package com.pennant.test;

import com.pennant.Employee;
import com.pennant.service.EmployeeService;
import com.pennant.service.impl.EmployeeServiceImpl;

public class Test {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("ravi");
		employee.setEmpSal(12.36);
		
		Employee employee1 = new Employee();
		employee1.setEmpId(2);
		employee1.setEmpName("sudhir");
		employee1.setEmpSal(14.36);
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.saveEmployee(employee1);
		employeeService.saveEmployee(employee);
		employeeService.deleteEmployee(2);
		
		Employee employee2 = employeeService.getEmployeeById();
		System.out.println("------Employee Fetching Details----------");
		System.out.println(employee2.getEmpId());
		System.out.println(employee2.getEmpName());
		System.out.println(employee2.getEmpSal());
	}
}
