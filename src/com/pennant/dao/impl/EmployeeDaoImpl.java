package com.pennant.dao.impl;

import java.util.List;

import com.pennant.Employee;
import com.pennant.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

	public void saveEmployee(Employee employee) {
		System.out.println("-------EmployeeSavingDetails-----------");
          System.out.println(employee.getEmpId());
          System.out.println(employee.getEmpName());
          System.out.println(employee.getEmpSal());
	}

	@Override
	public void deleteEmployee(int empId) {
             if(empId==1){
            	 System.out.println("ravi details are deleted");
             }else{
            	 System.out.println("sudhir details are deleted");
            	  
             }
	}

	@Override
	public Employee getEmployeeById() {
		  Employee employee=new Employee();
		  employee.setEmpId(1);
		  employee.setEmpName("ravi");
		  employee.setEmpSal(12.36);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
