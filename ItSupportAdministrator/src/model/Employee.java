package model;

public class Employee {

	private String firstName;

	private String lastName;

	public Employee(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getfirstName() {

		return this.firstName;

	}

	public String getlastName() {

		return this.lastName;

	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

}
