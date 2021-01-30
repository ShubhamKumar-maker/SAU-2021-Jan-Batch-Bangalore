package employeeSpringMVC.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import employeeSpringMVC.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setId(rs.getInt("Id"));
		emp.setFirstName(rs.getString("FirstName"));
		emp.setLastName(rs.getString("LastName"));
		emp.setEmail(rs.getString("Email"));
		return emp;
	}

}
