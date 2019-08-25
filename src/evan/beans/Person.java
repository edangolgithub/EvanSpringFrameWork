package evan.beans;

import java.util.List;

public class Person 
{
String name;
int id;
List<String> nicknames;
List<Phone> phones;
public Person(String name, int id, List<String> nicknames, List<Phone> phones) {
	super();
	this.name = name;
	this.id = id;
	this.nicknames = nicknames;
	this.phones = phones;
}
public List<Phone> getPhones() {
	return phones;
}
public void setPhones(List<Phone> phones) {
	this.phones = phones;
}
public Person(String name, int id, List<String> nicknames) {
	super();
	this.name = name;
	this.id = id;
	this.nicknames = nicknames;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<String> getNicknames() {
	return nicknames;
}
public void setNicknames(List<String> nicknames) {
	this.nicknames = nicknames;
}

}
