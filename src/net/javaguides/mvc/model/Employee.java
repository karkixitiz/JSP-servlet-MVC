package net.javaguides.mvc.model;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	
	
	public Employee(int id, String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
