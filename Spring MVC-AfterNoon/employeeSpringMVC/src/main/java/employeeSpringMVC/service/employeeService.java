package employeeSpringMVC.service;

import java.util.List;

import employeeSpringMVC.entity.Employee;

public interface employeeService {
	List<Employee> listEmployee();
	void saveEmployee(Employee employee);

}
