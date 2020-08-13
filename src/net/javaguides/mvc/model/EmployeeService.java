package net.javaguides.mvc.model;

import java.util.Arrays;
import java.util.List;

public class EmployeeService {
	public List<Employee> getEmployees(){
		return Arrays.asList(
				new Employee(101,"ram","karki"),
				new Employee(101,"ram","karki"),
				new Employee(102,"krishna","karki"));
	}

}
