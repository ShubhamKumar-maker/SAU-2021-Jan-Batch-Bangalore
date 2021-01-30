package employeeSpringMVC.dao;

import java.util.List;

import employeeSpringMVC.entity.Employee;

public interface EmployeeDAO {

	List<Employee> listEmployee();
	void saveEmployee(Employee employee);
	Employee updatedata(int id);
	void updateemp(Employee employee);
}
