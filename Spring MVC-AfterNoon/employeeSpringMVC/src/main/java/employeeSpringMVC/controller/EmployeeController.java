package employeeSpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import employeeSpringMVC.dao.EmployeeDAO;
import employeeSpringMVC.entity.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping("/showEmployee")
	public String showEmployee(Model model)
	{
		List<Employee> empl=employeeDAO.listEmployee();
		for(Employee em:empl)
		{
			System.out.println(em);
		}
		model.addAttribute("employeeList",empl);
		return "employee";
	}
	
	
	@GetMapping("/addEmployee")
	public String addEmployee(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "addEmployee";
	}
	
	@ResponseBody
	@GetMapping("/saveEmployee")
	public String saveEmployee(Employee employee)
	{
		
		if(employee.getId()==0)
		{
			employeeDAO.saveEmployee(employee);
		}
		else
		{
			employeeDAO.updateemp(employee);
		}
		
		
		//System.out.println(employee);
		return "Employee Save..";
	}
	
	
//	@ResponseBody
//	@GetMapping("/updateEmployee")
//	public void updateEmployee(Employee employee)
//	{
//		
//	}
	
	@GetMapping("/update")
	public String updateEmployee(@RequestParam("userid")int id, @ModelAttribute("employee")Employee employee)
	{
		
		Employee employee1=employeeDAO.updatedata(id);
		System.out.println(employee);
		
		employee.setFirstName(employee1.getFirstName());
		employee.setLastName(employee1.getLastName());
		employee.setEmail(employee1.getEmail());
		
//		Employee employee=new Employee();
//		model.addAttribute("employee", employee);
//		System.out.println(id);
		return "addEmployee";
	}
	

}
