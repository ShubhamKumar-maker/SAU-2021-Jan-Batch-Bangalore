package employeeSpringMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import employeeSpringMVC.dao.EmployeeDAO;
import employeeSpringMVC.entity.Employee;

public class employeeServiceImp implements employeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;

	public List<Employee> listEmployee() {
		List<Employee>thelist=employeeDAO.listEmployee();
		return thelist;
	}

	public void saveEmployee(Employee employee) {
		 employeeDAO.saveEmployee(employee);
		
	}

}
