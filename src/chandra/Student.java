package chandra;

import java.util.List;

public class Student {
	int id;
	String name;
	Address Address;
	List<String> subjects;
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Student(int id, String name, chandra.Address address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public Student() {
		super();
	}

}
