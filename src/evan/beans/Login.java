package evan.beans;

public class Login 
{
   String username;
   String password;
   
public Login() {
	System.out.println("deafutl");
}

public Login(String username, String password) {
	System.out.println("parametarized");
	
	this.username = username;
	this.password = password;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
}
