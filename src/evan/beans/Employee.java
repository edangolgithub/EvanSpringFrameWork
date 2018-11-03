package evan.beans;

import java.util.List;

public class Employee {
private int id;
private String name;
private Address address;
private List<Address> addresses;
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
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public List<Address> getAddresses() {
	return addresses;
}
public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
}


public Employee() {System.out.println("def cons");}
public Employee(int id) {this.id = id;}
public Employee(int id, String name) {
	this.id = id;
	this.name = name;
}


public Employee(String name) {	this.name = name;}

public Employee(List<Address> addresses) {
	super();	
	this.addresses = addresses;
}

public Employee(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

void show(){
	System.out.println(id+" "+name);
	System.out.println(address.toString());
}
public void showaddresses()
{
	for (Address address : addresses) {
		System.out.println(address.getCountry());
	}
}
}

