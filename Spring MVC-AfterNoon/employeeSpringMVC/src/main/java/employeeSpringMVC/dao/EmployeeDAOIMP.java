package employeeSpringMVC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import employeeSpringMVC.entity.Employee;
import employeeSpringMVC.rowMapper.EmployeeRowMapper;

@Repository
public class EmployeeDAOIMP implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<Employee> listEmployee() {
		
		String qry="Select * from employee";
		List<Employee>thelist=jdbctemplate.query(qry,new EmployeeRowMapper());
		
		return thelist;
	}

	public void saveEmployee(Employee employee) {
		Object[] sqlParamenter= {employee.getFirstName(),employee.getLastName(),employee.getEmail()};
		String qry="insert into employee(FirstName,LastName,email)values(?,?,?)";
		jdbctemplate.update(qry,sqlParamenter );
		
	}

	public Employee updatedata(int id) {
		String qry="select * from employee where id=?";
		Employee employee=jdbctemplate.queryForObject(qry, new EmployeeRowMapper(),id);
		
		return employee;
	}

	public void updateemp(Employee employee) {
		String sql="update employee set FirstName=?,LastName=?,email=? where Id=?";
		jdbctemplate.update(sql,employee.getFirstName(),employee.getLastName(),employee.getEmail(),employee.getId());
		
		
		
		
	}

}
