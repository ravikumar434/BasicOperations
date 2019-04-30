package com.pennant.service.impl;

import java.util.List;

import com.pennant.Employee;
import com.pennant.dao.EmployeeDao;
import com.pennant.dao.impl.EmployeeDaoImpl;
import com.pennant.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void saveEmployee(Employee employee) {
           EmployeeDao employeeDao=new EmployeeDaoImpl();
           employeeDao.saveEmployee(employee);
           }

	@Override
	public void deleteEmployee(int empId) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		employeeDao.deleteEmployee(empId);
	}

	@Override
	public Employee getEmployeeById() {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
	Employee employee=	employeeDao.getEmployeeById();
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}

}
