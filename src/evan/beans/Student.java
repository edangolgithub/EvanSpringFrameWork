package evan.beans;

public class Student {
	
	public Student(String name, int a, Course corse) {
		super();
		this.name = name;
		this.a = a;
		this.corse = corse;
	}

	private String name;
	private int a;
	private Course corse; 
	
public Course getCourse() {
		return corse;
	}
	public void setCourse(Course course) {
		corse = course;
	}
public Student(String name) {
		
		this.name = name;
	}
public Student(String name,int a) {
	
	this.name = name;
	this.a=a;
}

public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void displayInfo(){
	System.out.println("Hello: "+name);
	System.out.println("age: "+a);
	System.out.println(corse.getCourseName());
	
	
}
}
